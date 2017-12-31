package com.example.java;

import java.util.Scanner;

public class _01_InputOutput {
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
        System.out.println("What is your name? ");
    String name = reader.next();
        System.out.println("What is your age? ");
    int age = reader.nextInt();
        System.out.println("Your name is " + name + " and you are " + age + " years old.");
    }
}

