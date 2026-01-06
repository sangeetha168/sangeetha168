package com.gqt.javabasics.twoClass;

import java.util.Scanner;

public class sumofelefrom0to9999 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        String[] value = s.split(",");
        if (value.length < 2) {
            System.out.println("invalid input i&j i<=j<1000");
            return;
        }
        try {
            int i = Integer.parseInt(value[0]);
            int j = Integer.parseInt(value[1]);

            if (i >= j || i < 0 || j >= 1000) {
                System.out.println("invalid input i&j i<=j<1000");
            } else {
                System.out.println(rangesum(i, j) + " ");
            }
        } catch (NumberFormatException e) {
            System.out.println("invalid input i&j i<=j<1000");
        }
    }

    public static int rangesum(int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += k;
        }
        return sum;
    }
}
