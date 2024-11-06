package com.example.xyz_last_edition.exceptions;
// Creating a custom exception that can be thrown when a user tries
// to add a Employee that already exists
public class EmployeeAlreadyExistsException extends RuntimeException{

        private String message;

        public EmployeeAlreadyExistsException() { }

        public EmployeeAlreadyExistsException(String msg) {
            super(msg);
            this.message = msg;
        }
    }

