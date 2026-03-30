package com.SpringSecurityChapter2.SpringSecurityChapter2.RestController;

import com.SpringSecurityChapter2.SpringSecurityChapter2.dao.BookStoreDao;
import com.SpringSecurityChapter2.SpringSecurityChapter2.entity.Book;
import com.SpringSecurityChapter2.SpringSecurityChapter2.security.entity.RegisterRequest;
import com.SpringSecurityChapter2.SpringSecurityChapter2.security.entity.User;
import com.SpringSecurityChapter2.SpringSecurityChapter2.security.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/my-book-store")
public class HelloController {

    private final UserService userService;
    BookStoreDao bookStoreDao;

    public HelloController(UserService userService, BookStoreDao bookStoreDao) {
        this.userService = userService;
        this.bookStoreDao = bookStoreDao;
    }


    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }


    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
        System.out.println(">>> /register hit");
        userService.registerUser(
                request.getUsername(),
                request.getPassword(),
                request.getAuthority()
        );

        return ResponseEntity.ok("User Successfully Registered");
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getUsers() {
        List<User> users = userService.getUsers();
        return ResponseEntity.ok(users);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "Deleted user " + id + " successfully";
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> books = bookStoreDao.getAllBooks();
        return ResponseEntity.ok(books);
    }

    @GetMapping("/books/{bookId}")
    public ResponseEntity<Book> getBookById(@PathVariable Integer bookId) {
        Book tempbook = bookStoreDao.getBookById(bookId);

        if (tempbook == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(tempbook);
    }


    @PostMapping("/books")
    public void createBook(@RequestBody Book book) {
        bookStoreDao.createBook(book);
    }



}
