
import java.util.Scanner;


public class Conditional {
    public static void main(String[] args) {
        //1. Write a program that reads an integer as user input and prints whether the number is Odd or Even to the console
        // Scanner number = new Scanner(System.in);
        // System.out.println("Insira um número");
        // int a = number.nextInt();

        // if (a%2==0){
        //     System.out.println("O número " + a + " é par");
        // }
        //     else {
        //         System.out.println("O número " + a + " é ímpar");
        //     };   
       

        // 2. Write a program that takes three numbers as input and prints the largest among them
        // Scanner number = new Scanner(System.in);
        // int a = number.nextInt();
        // int b = number.nextInt();
        // int c = number.nextInt();
        // int maior = 0;

        // if (a>maior) {
        //     maior = a;
        // }
        // if (b>maior) {
        //     maior = b;
        // }
        // if (c>maior) {
        //     maior = c;
        // };
        
        // System.out.println("O maior número é " + maior);
            

        

        // 3. Write a program that checks if a given input year is a leap year or not
        Scanner number = new Scanner(System.in);
        int year = number.nextInt();

        if (year%4==0) {
            System.out.println("O ano " + year + " é bissexto");
            }
            else {
                System.out.println("O ano " + year + " não é bissexto");
            }
        };
    };