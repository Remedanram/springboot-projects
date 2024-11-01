package com.book.crud_on_books.service;

import com.book.crud_on_books.dto.BookRequestDto;
import com.book.crud_on_books.entity.Book;
import com.book.crud_on_books.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> getAllBooks() {

        return bookRepository.findAll();
    }
//    public Book createBook(Book book) {
//           return bookRepository.save(book);
//    }

    public Book add(BookRequestDto requestDto){
        Book book=new Book();
        book.setBookName(requestDto.getBookName());
        book.setBookDescription(requestDto.getBookDescription());
        book.setCost(requestDto.getCost());
        book.setNumberOFPage(requestDto.getNumberOFPage());
          return bookRepository.save(book);

    }

    public Optional<Book> getBookById(Long id) {

        return bookRepository.findById(id);
    }
    public Book updateBook(Long id, Book bookDetails) {
        Book book = bookRepository.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        book.setBookName(bookDetails.getBookName());
        book.setBookDescription(bookDetails.getBookDescription());
        book.setCost(bookDetails.getCost());
        book.setNumberOFPage(bookDetails.getNumberOFPage());
        return bookRepository.save(book);
    }

    public void deleteById(Long id) {

        bookRepository.deleteById(id);
    }
}
