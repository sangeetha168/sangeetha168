package com.gqt.javabasics.dsa;

import java.util.Scanner;

public class Maxnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();

            String[] parts = input.split(",");
            int N1 = Integer.parseInt(parts[0].trim());
            int N2 = Integer.parseInt(parts[1].trim());
            int N3 = Integer.parseInt(parts[2].trim());

            int greatest = Math.max(N1, Math.max(N2, N3));
            System.out.println(greatest);
        } else {
            System.out.println("No input provided!");
        }

        scanner.close();
    }
}
