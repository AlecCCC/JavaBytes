package com.SpringSecurityChapter2.SpringSecurityChapter2.dao;


import com.SpringSecurityChapter2.SpringSecurityChapter2.entity.Book;

import java.util.List;

public interface BookStoreDao {

    void createBook(Book book);

    Book getBookById(Integer id);

    List<Book> getAllBooks();

}
