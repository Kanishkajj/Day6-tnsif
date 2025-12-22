package com.tnsif.Interface;

public class GreetingEx {

    public static void main(String[] args) {

        // lambda expression
        Greeting gd = () -> {
            System.out.println("Hi All! Welcome to the Java Session");
        };

        gd.greet();
    }
}



