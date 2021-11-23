package com.api.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.library.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long>{

}
