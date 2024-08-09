package org.admin.services.implement;

import org.admin.entities.role;
import org.admin.repositories.irolerepository;
import org.admin.services.interfaces.iroleservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class roleservice implements iroleservice {

    @Autowired
    private irolerepository roleRepository;

    @Override
    public Page<role> findAll(Pageable pageable) {
        return roleRepository.findAll(pageable);
    }

    @Override
    public List<role> getAll() {
        return roleRepository.findAll();
    }

    @Override
    public Optional<role> findOneById(Integer roleId) {
        return roleRepository.findById(roleId);
    }

    @Override
    public role createOrEditOne(role role) {
        return roleRepository.save(role);
    }

    @Override
    public void deleteOneById(Integer roleId) {
        roleRepository.deleteById(roleId);
    }
}
