package com.api.library.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.library.repositories.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository repo;
	
	private Book find(Integer)

}
