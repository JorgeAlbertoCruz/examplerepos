package org.admin.controllers;

import org.admin.entities.area;
import org.admin.services.interfaces.iareaservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@RequestMapping("area")
public class areacontroller {

    @Autowired
    private iareaservice areaservice;

    @GetMapping
    public String index(Model model, @RequestParam("page") Optional<Integer> page, @RequestParam("size") Optional<Integer> size){
        int currentPage = page.orElse(1) - 1;
        int pageSize = size.orElse(5);
        Pageable pageable = PageRequest.of(currentPage, pageSize);

        Page<area> areas = areaservice.findAll(pageable);
        model.addAttribute("roles", areas);

        int totalPages = areas.getTotalPages();
        if (totalPages > 0) {
            List<Integer> pageNumbers = IntStream.rangeClosed(1, totalPages)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("pageNumbers", pageNumbers);
        }

        return "area/index";
    }

    @GetMapping("/details/{id}")
    public String details(@PathVariable("id") Integer id, Model model){
        area area = areaservice.findOneById(id).orElse(null);
        model.addAttribute("role", area);
        return "role/details";
    }

    @GetMapping("/create")
    public String create(area area){
        return "area/create";
    }

    @PostMapping("/save")
    public String save(area area, BindingResult result, Model model, RedirectAttributes attributes){
        if(result.hasErrors()){
            model.addAttribute("area", area);
            attributes.addFlashAttribute("error", "No se pudo guardar debido a un error.");
            return "area/create";
        }

        areaservice.createOrEditOne((org.admin.entities.area) area);
        attributes.addFlashAttribute("msg", "Area creado correctamente");
        return "redirect:/area";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model){
        area area = areaservice.findOneById(id).orElse(null);
        model.addAttribute("area", area);
        return "area/edit";
    }

    @GetMapping("/remove/{id}")
    public String remove(@PathVariable("id") Integer id, Model model){
        area area = areaservice.findOneById(id).orElse(null);
        model.addAttribute("area", area);
        return "area/delete";
    }

    @PostMapping("/delete")
    public String delete(area area, RedirectAttributes attributes){
        areaservice.deleteOneById(area.getAreaid());
        attributes.addFlashAttribute("msg", "Area eliminado correctamente");
        return "redirect:/area";
    }
}
