package com.api.library.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.library.domain.Book;
import com.api.library.services.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookResource {
	
	@Autowired
	private BookService service;
	
	public ResponseEntity<Book> find(@PathVariable Long id) {
		Book obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

}
