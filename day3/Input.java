import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        //1. Write a program that reads user input and print it to the console.
        Scanner obj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Insira seu nome: ");

        String firstName = obj.nextLine();
        System.out.println("Your name is: " + firstName);

        System.out.println("Insira sua idade: ");

        String number = obj.nextLine();
        System.out.println("Your age is: " + number);
       //2. Modify the program to read and print different data type inputs (integers, floating-point numbers, strings)
      //3. Write a program to read the user input using Scanner class
    }
}