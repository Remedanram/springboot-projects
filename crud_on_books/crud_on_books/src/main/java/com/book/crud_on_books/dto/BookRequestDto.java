package com.book.crud_on_books.dto;

import lombok.Data;

@Data
public class BookRequestDto {
    private String bookName;
    private String bookDescription;
    private double cost;
    private int numberOFPage;
}
