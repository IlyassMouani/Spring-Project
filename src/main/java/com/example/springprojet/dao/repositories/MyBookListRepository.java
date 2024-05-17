package com.example.springprojet.dao.repositories;

import com.example.springprojet.dao.entities.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyBookListRepository extends JpaRepository<MyBookList,Integer> {
}
