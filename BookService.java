package com.mrk.john.bookapplication.bookproject.services;

import java.util.List;

import com.mrk.john.bookapplication.bookproject.models.Book;
import com.mrk.john.bookapplication.bookproject.repositories.BookRepository;

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
    repo.createBook(book);
  }
  public void updateBook(Book book){
    repo.updateBook(book);
  }
  public void deleteBook(Long bno){
    repo.deleteBook(bno);
  }
  public Book readBook(Long bno){
    return repo.readBook(bno);
  }

}
