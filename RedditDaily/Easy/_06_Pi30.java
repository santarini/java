package com.example.java;

public class _06_Pi30 {

    public static void main(String[] args) {
        double number = Math.PI;
        String numberAsString = String.format ("%.30f", number);
        System.out.println(numberAsString);
    }
}
