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
  @GetMapping("/title")
  public String displayvalue(){
    return "Welcome to Book Application";
  }
@GetMapping("/books")
public List<Book> readBooks(){
return service.readBooks();
}
  @PostMapping("/create")
  public String createBook(@RequestBody Book book){
    service.createBook(book);
    return "Book Successfully Created";
  }
  @PutMapping("/update")
  public String updateBook(@RequestBody Book book){
    service.updateBook(book);
    return "Book Successfully Updated";
  }
  @DeleteMapping("/delete")
  public String deleteBook(@RequestBody Long bno){
    service.deleteBook(bno);
    return "Book Successfully Deleted";
  }
  @GetMapping("/book")
  public Book readBook(@RequestBody Long bno){
    return service.readBook(bno);
  }
}
