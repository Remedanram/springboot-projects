package com.book.crud_on_books.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "book")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String bookName;
    private String bookDescription;
    private double cost;
    private int numberOFPage;
}
