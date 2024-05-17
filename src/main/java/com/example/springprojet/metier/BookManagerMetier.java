package com.example.springprojet.metier;


import com.example.springprojet.dao.entities.Book;
import com.example.springprojet.dao.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
    public class BookManagerMetier {

        @Autowired
        private BookRepository bRepo;

        public void save(Book b) {
            bRepo.save(b);
        }

        public Collection<Book> getAllBook(){
            return bRepo.findAll();
        }

        public Book getBookById(int id) {
            return bRepo.findById(id).get();
        }
        public void deleteById(int id) {
            bRepo.deleteById(id);
        }}
