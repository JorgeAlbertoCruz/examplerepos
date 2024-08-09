package org.admin.services.implement;

import org.admin.entities.user;
import org.admin.repositories.iuserrepository;
import org.admin.services.interfaces.iuserservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userservice implements iuserservice {

    @Autowired
    private iuserrepository userrepository;

    @Override
    public Page<user> findAll(Pageable pageable) {
        return userrepository.findAll(pageable);
    }

    @Override
    public List<user> getAll() {
        return userrepository.findAll();
    }

    @Override
    public Optional<user> findOneById(Integer userid) {
        return userrepository.findById(userid);
    }

    @Override
    public user createOrEditOne(user user) {
        return userrepository.save(user);
    }

    @Override
    public void deleteOneById(Integer userid) {
        userrepository.deleteById(userid);
    }
}
