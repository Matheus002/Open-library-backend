package com.api.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.library.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
