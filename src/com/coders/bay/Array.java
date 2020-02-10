package com.coders.bay;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int result = 0;
        String num = "0";
        int[] zahlen;

        Scanner sc = new Scanner(System.in);


        for (int i = 0; i >= 0; i++) {


            System.out.println("Bitte Zahl eingeben");
            num = sc.nextLine();
            if (num.contains("q")) {
                System.out.println("ABBRUCH");
            } else {
                result = Integer.parseInt(num);
                zahlen = new int[result];

            }
        }
    }

}
