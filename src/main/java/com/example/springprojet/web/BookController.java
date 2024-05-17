package com.example.springprojet.web;

import com.example.springprojet.metier.BookManagerMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.springprojet.dao.entities.Book;
import com.example.springprojet.dao.entities.MyBookList;
import com.example.springprojet.metier.BookManagerMetier;
import com.example.springprojet.metier.MyBookListManagerMetier;
import java.util.*;

@Controller
public class BookController {

    @Autowired
    private BookManagerMetier metier;

    @Autowired
    private MyBookListManagerMetier mlmetier;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/book_register")
    public String bookRegister() {
        return "bookRegister";
    }

    @GetMapping("/available_books")
    public ModelAndView getAllBook() {
        Collection<Book>list=metier.getAllBook();
        return new ModelAndView("bookList","book",list);
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b) {
        metier.save(b);
        return "redirect:/available_books";
    }
    @GetMapping("/my_books")
    public String getMyBooks(Model model)
    {
        Collection<MyBookList>list=mlmetier.getAllMyBooks();
        model.addAttribute("book",list);
        return "myBooks";
    }
    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id) {
        Book b=metier.getBookById(id);
        MyBookList mb=new MyBookList(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
        mlmetier.saveMyBooks(mb);
        return "redirect:/my_books";
    }

    @RequestMapping("/editBook/{id}")
    public String editBook(@PathVariable("id") int id,Model model) {
        Book b=metier.getBookById(id);
        model.addAttribute("book",b);
        return "bookEdit";
    }
    @RequestMapping("/deleteBook/{id}")
    public String deleteBook(@PathVariable("id")int id) {
        metier.deleteById(id);
        return "redirect:/available_books";
    }

}