package com.example.springprojet.metier;

import com.example.springprojet.dao.entities.MyBookList;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public interface MyBookListManager {
    public void saveMyBooks(MyBookList book);
    public Collection<MyBookList> getAllMyBooks();
    public void deleteById(int id);
}