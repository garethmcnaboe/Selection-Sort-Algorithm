package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String[] newArray = new String[a];
        sc.nextLine(); //needs to be added between nextInt() and nextLine() to avoid skipping of line. (Came up on cs620c)

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = sc.nextLine();
        }

        int min;

        for (int outer = 0; outer < newArray.length; outer++) {
            min = outer;

            for (int i = outer + 1; i < newArray.length; i++) {
                if (newArray[i].length() < newArray[min].length()) {
                    min = i;
                }
                if (newArray[i].length() == newArray[min].length()) {
                    int c = newArray[i].compareTo(newArray[min]);
                    if (c > 0) {
                        min = i;
                    }
                }
            }
            String temp = newArray[outer];
            newArray[outer] = newArray[min];
            newArray[min] = temp;
        }

        System.out.println(newArray[b-1]);

        for (int j = 0; j < newArray.length; j++){
            System.out.println(newArray[j]);
            }
        }
    }

