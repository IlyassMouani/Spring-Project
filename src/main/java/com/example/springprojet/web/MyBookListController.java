package com.example.springprojet.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springprojet.metier.MyBookListManagerMetier;

@Controller
public class MyBookListController {

    @Autowired
    private MyBookListManagerMetier metier;

    @RequestMapping("/deleteMyList/{id}")
    public String deleteMyList(@PathVariable("id") int id) {
        metier.deleteById(id);
        return "redirect:/my_books";
    }
}