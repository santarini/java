package com.example.java;

import java.util.Scanner;

public class FutureValueCalc {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("How much money will you start with?");
        int pv = reader.nextInt();
        System.out.println("What percentage interest rate can you achieve per year? ");
        float pr = reader.nextInt();
        float i = (pr/100);
        System.out.println("How many years do you plan to maintain the position? ");
        int n = reader.nextInt();
        float EAR = (float)Math.pow((1+i),n);
        System.out.println("Are you planning on making regular contributions or withdrawals from the inital deposit? ");
        String pmtQ = reader.next();
        System.out.println("Your PV " + pv + ", your pr " + pr + ", your i " + i +", your n " + n +" EAR " + EAR);
        float pmt;
        if (pmtQ.equals("Yes")){
            System.out.println("How much are you planning to withdraw or deposit (net contribution)?");
            pmt = reader.nextInt();
        }else pmt = 0;
        float fvPMT = (pmt *(EAR - 1)/i);
        float fv = ((pv * EAR) + fvPMT);
        System.out.println(fv);
    }
}
