package com.api.library.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.library.domain.Book;
import com.api.library.repositories.BookRepository;
import com.api.library.resources.exception.ObjectNotFoundException;

@Service
public class BookService {
	
	@Autowired
	private BookRepository repo;
	
	public Book find(Long id) {
		Optional<Book> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found! Id: "+ id));
	}

}
