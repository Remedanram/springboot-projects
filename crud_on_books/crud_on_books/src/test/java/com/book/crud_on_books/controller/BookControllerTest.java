package com.book.crud_on_books.controller;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class BookControllerTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Before All Method");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("After All Method");
    }

    @BeforeEach
    void setUp() {
        System.out.println("before each method");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After Each Method");
    }

    @Test
    public void testMethod1(){
        System.out.println("First Test Method ");
    }

    @Test
    public void testMethod2(){
        System.out.println("Second Test Method ");
    }

}