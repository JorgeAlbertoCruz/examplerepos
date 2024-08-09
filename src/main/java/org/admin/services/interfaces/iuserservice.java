package org.admin.services.interfaces;

import org.admin.entities.user;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface iuserservice {
    Page<user> findAll(Pageable pageable);

    List<user> getAll();

    Optional<user> findOneById(Integer userid);

    user createOrEditOne(user user);

    void deleteOneById(Integer userid);
}
