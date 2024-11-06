package com.example.xyz_last_edition.exceptions;

public class NoSuchEmployeesExistsException extends RuntimeException{
    private String message;
    public  NoSuchEmployeesExistsException(){ }
    public NoSuchEmployeesExistsException(String msg){
        super(msg);
        this.message=msg;
    }
}
