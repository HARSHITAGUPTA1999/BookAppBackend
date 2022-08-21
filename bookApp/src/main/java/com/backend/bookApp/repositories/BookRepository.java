package com.backend.bookApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.bookApp.models.Books;

@Repository
public interface BookRepository extends JpaRepository<Books, Integer>{

}
