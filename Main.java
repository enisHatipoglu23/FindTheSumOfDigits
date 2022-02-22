package com.company;

import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
	// write your code here
        //find the sum of digits
        Scanner scanner = new Scanner(System.in);
        System.out.println("Num: ");
        int a = scanner.nextInt();
        int b = 0;
        while(a!=0){

            b += a % 10;
            a /= 10;
        }
        System.out.println("Sum: " + b);
    }
}
