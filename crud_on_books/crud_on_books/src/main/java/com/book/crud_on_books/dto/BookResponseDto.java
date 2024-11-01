package com.book.crud_on_books.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BookResponseDto {
    private long id;
    private String bookName;
    private String bookDescription;
    private double cost;
    private int numberOFPage;

}
