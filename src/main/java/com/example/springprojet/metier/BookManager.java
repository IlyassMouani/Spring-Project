package com.example.springprojet.metier;

import com.example.springprojet.dao.entities.Book;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public interface BookManager {

    public void save(Book b);
    public Collection<Book> getAllBook();
    public Book getBookById(int id);
    public void deleteById(int id);
}
