package org.example.Exceptions;

public class QuestionReadException extends RuntimeException{
    public QuestionReadException(){
        System.out.println("Unreadable File");
    }
}
