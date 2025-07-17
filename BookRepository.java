package com.mrk.bala.bookapplication.bookproject.repositories;



import java.util.ArrayList;
import java.util.List;

import com.mrk.bala.bookapplication.bookproject.models.Book;
import com.mrk.bala.bookapplication.bookproject.models.BookCRUD;

public class BookRepository implements BookCRUD {
private List<Book> books=null;


public BookRepository() {
super();
// TODO Auto-generated constructor stub
books = new ArrayList<>();
books.add(new Book(1L,"Java Core","Murugan",2450.00));
books.add(new Book(2L,"Spring Boot","Shiva",3250.00));
books.add(new Book(3L,"Angular","Devi",4350.00));
books.add(new Book(4L,"HTML","Lakshmi",4950.00));

}

@Override
public void createBook(Book book) {
// TODO Auto-generated method stub

}

@Override
public List<Book> readBooks() {
// TODO Auto-generated method stub
return books;
}

@Override
public void updateBook(Book book) {
// TODO Auto-generated method stub

}

@Override
public void deleteBook(Long bno) {
// TODO Auto-generated method stub

}

@Override
public Book readBook(Long bno) {
// TODO Auto-generated method stub
return null;
}

}
