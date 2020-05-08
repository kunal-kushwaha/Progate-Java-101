package com.kunal;

import java.util.Scanner;

public class InputInJava {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a number: ");
//        int a = in.nextInt();
//        System.out.println(a);
        String s = in.next();
        System.out.println(s);
    }
}
