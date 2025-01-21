// Day 9 - Switch Statement
// 1. Write a program that reads the percentage and then prints their corresponding letter grade (A, B, C, D, or F) using switch statement

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner per = new Scanner(System.in);
        System.out.println("Insira a porcentagem:");
        int value = per.nextInt();

        switch (value/20) {
            case (0):
                System.out.println("F");;
                break;

            case (1):
                System.out.println("D");;
                break;

            case (2):
                System.out.println("C");;
                break;

            case (3):
                System.out.println("B");
                break;

            case (4):
                System.out.println("A");
                break;

            case (5):
                System.out.println("A");
                break;
        }
        
    }
}

// Reading List:
// 1. Understand the advantages and drawbacks of if-else and switch statements