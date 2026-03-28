package com.SpringSecurityChapter2.SpringSecurityChapter2.dao;

import com.SpringSecurityChapter2.SpringSecurityChapter2.entity.Book;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
}
