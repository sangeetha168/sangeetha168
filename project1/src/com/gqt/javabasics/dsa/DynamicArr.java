package com.gqt.javabasics.dsa;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        // Printing the elements using simple index-based loop
        System.out.println("Elements (using index-based loop):");
        for (int i = 0; i < n; i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();

        // Printing the elements using enhanced for-loop
        System.out.println("Elements (using enhanced for-loop):");
        for (int ele : numbers) {
            System.out.print(ele + " ");
        }

        sc.close();
    }
}
