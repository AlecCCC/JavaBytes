package com.SpringSecurityChapter2.SpringSecurityChapter2.RestController;

import com.SpringSecurityChapter2.SpringSecurityChapter2.dao.BookStoreDao;
import com.SpringSecurityChapter2.SpringSecurityChapter2.entity.Book;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/my-book-store")
public class HelloController {


    BookStoreDao bookStoreDao;

    public HelloController(BookStoreDao bookStoreDao) {
        this.bookStoreDao = bookStoreDao;
    }

    @GetMapping("/hello")
    public String hello(){

        return "Hello";

    }

    @Transactional
    @PostMapping("/books")
    public void createBook(@RequestBody Book book) {
        bookStoreDao.createBook(book);
    }

}
