package com.example.demo;

public class Controller {
    
    public void greet(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Controller c = new Controller();
        String msg="Hello World";
        c.greet(msg);
    }
}