package com.bitlabs.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bitlabs.demo.model.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

}
