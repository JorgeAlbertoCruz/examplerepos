package org.admin.services.implement;

import org.admin.entities.area;
import org.admin.repositories.iarearepository;
import org.admin.services.interfaces.iareaservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class areaservice implements iareaservice {
    @Autowired
    private iarearepository arearepository;

    @Override
    public Page<area> findAll(Pageable pageable) {
        return arearepository.findAll(pageable);
    }

    @Override
    public List<area> getAll() {
        return arearepository.findAll();
    }

    @Override
    public Optional<area> findOneById(Integer areaId) {
        return arearepository.findById(areaId);
    }

    @Override
    public area createOrEditOne(area area) {
        return arearepository.save(area);
    }

    @Override
    public void deleteOneById(Integer areaId) {
        arearepository.deleteById(areaId);
    }
}
