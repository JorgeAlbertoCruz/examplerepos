package org.admin.services.interfaces;

import org.admin.entities.deviceassignment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;




import java.util.List;
import java.util.Optional;

public interface ideviceassignmentservice {
    Page<deviceassignment> findAll (Pageable pageable);

    List<deviceassignment> getAll();

    Optional<deviceassignment> findOneById(Integer assignmentid);

    deviceassignment createOrEditOne(deviceassignment deviceassignment);

    void deleteOneById(Integer  assignmentid);

    deviceassignment save(deviceassignment deviceassignment);
}
