package com.example.java;

import java.util.Scanner;

public class BottleOfBeer {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How much many bottle of beer?");
        int start = reader.nextInt();
        int lessStart = start - 1;
        for (int i = start; i >= 1; start--){
            System.out.println(start + " Bottles of beer on the wall, " + start + " bottles of beer. \n" + "Take one down and pass it around," + lessStart + " bottles of beer on the wall." );
        }
    }
}
//At the moment this runs infinitely
