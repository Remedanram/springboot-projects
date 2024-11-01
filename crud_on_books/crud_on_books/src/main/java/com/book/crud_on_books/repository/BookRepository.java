package com.book.crud_on_books.repository;

import com.book.crud_on_books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book,Long>{

}
