//package com.gqt.javabasics.Dsaprogram;
//
//import java.util.HashSet;
//import java.util.Scanner;
//
//public class Day21LonelyInteger {
//
//    static int lonely(int[] arr) {
//    	HashSet<Integer> s=new HashSet<Integer>();
//        for (int i : arr) {
//            if (s.contains(i)) {
//                s.remove(i);
//            } else {
//                s.add(i);
//            }
//        }
//        // Only one element will be left in the set
//        for (int i : s) {
//            return i;
//        }
//        return -1; // just in case input is invalid
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of array: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter elements:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Lonely Integer: " + lonely(arr));
//    }
//}
//
//
//
//
//static int lonely(int[] arr) {
//	HashSet<Integer> s=new HashSet<Integer>();
//    for (int i : arr) {
//        if (s.contains(i)) {
//            s.remove(i);
//        } else {
//            s.add(i);
//        }
//    }
//    // Only one element will be left in the set
//    for (int i : s) {
//        return i;
//    }
//    return -1; // just in case input is invalid
//}