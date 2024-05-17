package com.example.springprojet.dao.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.cache.spi.support.CollectionReadOnlyAccess;

import java.util.Collection;

@Entity

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class MyBookList {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    private String name;
    private String author;
    private String price;
}
