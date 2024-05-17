package com.example.springprojet.metier;

import com.example.springprojet.dao.entities.MyBookList;
import com.example.springprojet.dao.repositories.MyBookListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class MyBookListManagerMetier {

    @Autowired
    private MyBookListRepository mybook;

    public void saveMyBooks(MyBookList book) {
        mybook.save(book);
    }

    public Collection<MyBookList> getAllMyBooks(){
        return mybook.findAll();
    }

    public void deleteById(int id) {
        mybook.deleteById(id);
    }
}