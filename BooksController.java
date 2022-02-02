package com.dxclearning1.restapp.controllers;

import com.dxclearning1.restapp.Book;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

    @GetMapping("/books")
 
    @GetMapping( "/books/{id}")

    @PostMapping("/books")

    @PutMapping("/books/{id}")

    @DeleteMapping( "/books/{id}")

      
    
}
