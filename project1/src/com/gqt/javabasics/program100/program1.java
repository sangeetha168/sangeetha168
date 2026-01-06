package com.gqt.javabasics.program100;

import java.util.*;

class program1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String str = sc.nextLine();
        String str_temp = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            str_temp = str_temp + str.charAt(i);
        }

        System.out.println("Reversed string: " + str_temp);

        if (str.equals(str_temp)) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }

        sc.close();
    }
}
