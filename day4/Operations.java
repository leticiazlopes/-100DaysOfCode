//1. Write a program that declares two integer variables and perform basic arithmetic operations (addition, subtraction, multiplication, division) on them. Print the results to the console.

import java.text.DecimalFormat;
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        // int x = 2;
        // int y = 2;

        // System.out.println("Addiction: " + (x+y) + "; Subtraction: " + (x-y) + "; Multiplication: " + (x*y) + "; Division: " + (x/y));


//2. Write a program that calculates the area of a rectangle. Prompt the user to input the length(integer) and width(integer) of the rectangle, calculate the area (length * width), and print the result.

// Scanner calc = new Scanner (System.in);

// System.out.println("Insira a altura:");
// int altura = calc.nextInt();

// System.out.println("Insira a largura: ");
// int largura = calc.nextInt();

// int area = (altura*largura);

// System.out.println("Área: " + area);


//3. Modify the above program to read decimal numbers as the length and width, and output the area to two decimal points
        Scanner calc = new Scanner (System.in);

        System.out.println("Insira a altura:");
        double altura = calc.nextDouble();

        System.out.println("Insira a largura: ");
        double largura = calc.nextDouble();

        double area = (altura*largura);

        String resultadoFormatado = String.format("%.2f", area);

        System.out.println("Área: "  + resultadoFormatado);

        //double numero= 10.00;
        ////DecimalFormat formato = new DecimalFormat("#.##");      
        ////numero = Double.valueOf(formato.format(numero));


    }
}