package com.example.trg.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.trg.spring.entity.Book;

public interface BookRepository  extends JpaRepository<Book, Integer>{

}
