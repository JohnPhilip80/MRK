package com.mrk.bala.bookapplication.bookproject.models;

public class Book {
private Long bno;
private String title;
private String author;
private Double price;


public Book(String title, String author, Double price) {
super();
this.title = title;
this.author = author;
this.price = price;
}
public Book(Long bno, String title, String author, Double price) {
super();
this.bno = bno;
this.title = title;
this.author = author;
this.price = price;
}
public Long getBno() {
return bno;
}
public void setBno(Long bno) {
this.bno = bno;
}
public String getTitle() {
return title;
}
public void setTitle(String title) {
this.title = title;
}
public String getAuthor() {
return author;
}
public void setAuthor(String author) {
this.author = author;
}
public Double getPrice() {
return price;
}
public void setPrice(Double price) {
this.price = price;
}
}
