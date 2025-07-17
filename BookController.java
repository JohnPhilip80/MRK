package com.mrk.bala.bookapplication.bookproject.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mrk.bala.bookapplication.bookproject.models.Book;
import com.mrk.bala.bookapplication.bookproject.services.BookService;
@RestController
@RequestMapping("/book/api")
public class BookController {
private BookService service;

public BookController() {
super();
// TODO Auto-generated constructor stub
service = new BookService();
}
@GetMapping("/books")
public List<Book> readBooks(){
return service.readBooks();
}

}
