package com.coders.bay;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        String num;

        Scanner sc = new Scanner(System.in);
        int p;
        int result;
        int[] zahlen = new int[0];

        for (int i = 0; i >= 0; i++) {

            System.out.println("Bitte Zahl eingeben");
            num = sc.nextLine();

            if (num.contains("q")) {
                System.out.println("ABBRUCH");
                break;
            } else {
                result = Integer.parseInt(num);
                int[] zahlenNeu = new int[i + 1];

                for (p = 0; p < i; p++) {
                    zahlenNeu[p] = zahlen[p];
                }
                zahlenNeu[i] = result;
                zahlen = zahlenNeu;
            }

        }

        System.out.println(Arrays.toString(zahlen));

        int k;
        int maximumContainer = 0;

        for (k = 0; k < zahlen.length; k++) {
            if (zahlen[k] >= maximumContainer) {
                maximumContainer = zahlen[k];
            }
        }
        System.out.println("Maximum ist: " + maximumContainer);

    }


}
