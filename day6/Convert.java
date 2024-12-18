public class Convert {
    public static void main(String[] args) {
        //Convert a String to an Integer

        String name = "18";
        int i = Integer.valueOf(name);
        System.out.println(i);

        //Convert a String to a Float

        float f = Float.valueOf(name);
        System.out.println(f);

        //Convert an Integer to a String using valueOf() method

        int a = 23;
        String b = String.valueOf(a);
        System.out.println(b);

       
        //Convert an Integer to a String using toString() method
        int v = 24;
        String c = Integer.toString(v);
        System.out.print(c);
    }
    
}