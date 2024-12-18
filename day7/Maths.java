public class Maths {

    public static void main(String[] args) {
        
            
// Write a program that performs the following tasks using Math class:
// Maximum of 2 numbers
        int a = 2;
        int b = 4;
        float c = 3.2f;
        double d = -6.44d;
        System.out.println(Math.max(a,b));
        
        
// Minimum of 2 numbers
        System.out.println(Math.min(a,b));
// Square root of a number
        System.out.println(Math.sqrt(a));
// Floor and Ceil of a float
        System.out.println(Math.floor(c) + " smallest integer less than or equal to the float");
        System.out.println(Math.ceil(c) + " largest integer greater than or equal to the float");

// Abs value of a double
        System.out.println(Math.abs(d));
    }
}
