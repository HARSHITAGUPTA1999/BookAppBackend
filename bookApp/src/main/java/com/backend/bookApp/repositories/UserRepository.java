package com.backend.bookApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.backend.bookApp.models.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{

}
