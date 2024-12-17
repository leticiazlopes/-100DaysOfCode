//1. Write a program that utilizes increment(++) and decrement(--) operators.

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int maioresDeIdade = 3;
        int menoresDeIdade = 5;
        Scanner age = new Scanner(System.in);
        System.out.println("Insira sua idade: ");
        int clientAge1 = age.nextInt();

        if (clientAge1 >= 18) {
            maioresDeIdade++;
        };

        System.out.println("Maiores de idade: " + maioresDeIdade);
        System.out.println("Menores de idade: " + menoresDeIdade);


    }
}

//2. Write a program that utilizes the following compound operators +=, -=, *=, /=, and %=.
