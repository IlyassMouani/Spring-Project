package com.example.springprojet.dao.repositories;

import com.example.springprojet.dao.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
