package org.admin.services.implement;

import org.admin.entities.deviceassignment;
import org.admin.repositories.ideviceassignmentrepository;
import org.admin.services.interfaces.ideviceassignmentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class deviceassignmentservice implements ideviceassignmentservice {
    @Override
    public deviceassignment save(deviceassignment deviceassignment) {
        return deviceassignmentrepository.save(deviceassignment);
    }

    @Autowired
    private ideviceassignmentrepository deviceassignmentrepository;

    @Override
    public Page<deviceassignment> findAll(Pageable pageable) {
        return  deviceassignmentrepository.findAll(pageable);
    }

    @Override
    public List<deviceassignment> getAll() {
        return deviceassignmentrepository.findAll();
    }

    @Override
    public Optional<deviceassignment> findOneById(Integer assignmentid) {
        return deviceassignmentrepository.findById(assignmentid);
    }

    @Override
    public deviceassignment createOrEditOne(deviceassignment deviceassignment) {
        return deviceassignmentrepository.save(deviceassignment);
    }

    @Override
    public void deleteOneById(Integer assignmentid) {
                deviceassignmentrepository.deleteById(assignmentid);
    }
}
