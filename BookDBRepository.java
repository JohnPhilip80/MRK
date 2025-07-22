package com.mrk.john.bookapplication.bookproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mrk.john.bookapplication.bookproject.models.Book;
@Repository
public interface BookDBRepository extends JpaRepository<Book,Long> {
	Book getBookByBno(Long bno);
}
