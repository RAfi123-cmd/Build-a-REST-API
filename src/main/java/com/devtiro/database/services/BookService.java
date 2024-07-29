package com.devtiro.database.services;

import java.util.List;
import java.util.Optional;

import com.devtiro.database.domain.entities.BookEntity;

public interface BookService {
    BookEntity createBook(String isbn, BookEntity book);

    List<BookEntity> findAll();

    Optional<BookEntity> findOne(String isbn);
}
