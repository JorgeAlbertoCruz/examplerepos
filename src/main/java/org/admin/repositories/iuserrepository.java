package org.admin.repositories;

import org.admin.entities.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface iuserrepository extends JpaRepository<user, Integer> {

}
