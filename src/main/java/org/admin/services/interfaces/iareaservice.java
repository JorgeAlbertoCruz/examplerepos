package org.admin.services.interfaces;

import org.admin.entities.area;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface iareaservice {

    Page<area> findAll(Pageable pageable);

    List<area> getAll();

    Optional<area> findOneById(Integer areaId);

    area createOrEditOne(area area);

    void deleteOneById(Integer areaId);
}
