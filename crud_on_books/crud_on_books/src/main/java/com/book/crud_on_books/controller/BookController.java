package com.book.crud_on_books.controller;

import com.book.crud_on_books.dto.BookRequestDto;
import com.book.crud_on_books.entity.Book;
import com.book.crud_on_books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class BookController {
    @Autowired
    private BookService bookService;
    //to get all books
    @GetMapping("/getbooks")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

//    }
    @PostMapping("/addbooks")
    public ResponseEntity<Book> addbooks(@RequestBody BookRequestDto requestDto){
        Book responseDto = bookService.add(requestDto);
        return ResponseEntity.ok(responseDto);
    }
    //to get book by their id
@GetMapping("/getbook/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id){
    return bookService.getBookById(id)
            .map(book -> ResponseEntity.ok().body(book))
            .orElse(ResponseEntity.notFound().build());
}
//update book based on it's id
@PutMapping("/book/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book bookDetails){
    Book Updatebook=bookService.updateBook(id,bookDetails);
    return ResponseEntity.ok(Updatebook);
}
@DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
    bookService.deleteById(id);
}

}

