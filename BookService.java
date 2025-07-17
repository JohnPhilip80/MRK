package com.mrk.bala.bookapplication.bookproject.services;

import java.util.List;

import com.mrk.bala.bookapplication.bookproject.models.Book;
import com.mrk.bala.bookapplication.bookproject.repositories.BookRepository;

public class BookService {
private BookRepository repo = null;

public BookService() {
super();
// TODO Auto-generated constructor stub
repo= new BookRepository();
}
public List<Book> readBooks(){
return repo.readBooks();
}
  public void createBook(Book book){
    repo.createBook();
  }
  public void updateBook(Book book){
    repo.updateBook();
  }
  public void deleteBook(Long bno){
    repo.deleteBook();
  }
  public Book readBook(Long bno){
    return repo.readBook();
  }

}
