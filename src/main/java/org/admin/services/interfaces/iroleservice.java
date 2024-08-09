package org.admin.services.interfaces;

import org.admin.entities.role;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface iroleservice {
    Page<role> findAll(Pageable pageable);

    List<role> getAll();

    Optional<role> findOneById(Integer roleId);

    role createOrEditOne(role role);

    void deleteOneById(Integer roleId);
}
