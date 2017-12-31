package com.example.java;

import java.util.Scanner;

public class _08_BottlesOfBeer {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How much many bottle of beer?");
        int start = reader.nextInt();
        int lessStart = start - 1;
        for (int i = start; i >= 1; i-= 1){
            System.out.println(i + " Bottles of beer on the wall, " + i + " bottles of beer. \n" + "Take one down and pass it around," + (i - 1) + " bottles of beer on the wall." );
        }
    }
}
