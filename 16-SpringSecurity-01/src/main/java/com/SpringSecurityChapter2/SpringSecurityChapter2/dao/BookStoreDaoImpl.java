package com.SpringSecurityChapter2.SpringSecurityChapter2.dao;

import com.SpringSecurityChapter2.SpringSecurityChapter2.entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class BookStoreDaoImpl implements BookStoreDao{

    EntityManager entityManager;

    public BookStoreDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void createBook(Book book) {
        entityManager.persist(book);
    }

    @Override
    public Book getBookById(Integer id) {
        return entityManager.find(Book.class, id);
    }

    @Override
    public List<Book> getAllBooks() {
        TypedQuery<Book> query = entityManager.createQuery("Select b From Book b", Book.class);
        return query.getResultList();
    }
}
