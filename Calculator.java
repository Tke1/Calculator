import static java.lang.System.out;

public class Calculator 
{
    public static int add(int a, int b)
    {
        return a + b;
    }
    public static int substract (int a, int b)
    {
        return a - b;
    }
    public static int multiply (int a, int b)
    {
        return a * b;
    }
    public static float divde (float a, float b)
    {
        return (float)a/ (float)b;
    }
    public static void main(String[] args)
       { 
        int x = add(5, 7);
        System.out.println("5 plus 7 equals " + x);
        
        System.out.println("3 plus 5 equals " + add(3, 5));
        System.out.println("1 plus 2 equals " + add(1, 2));
        
        System.out.println("9 minus 4 equals " + substract(9, 4));
        System.out.println("9 minus 3 equals " + substract(9, 3));
        
        System.out.println("3 times 3 equals " + multiply(3, 3));
        System.out.println("2 times 4 equals " + multiply(2, 4));
        
        System.out.println("16 divide 4 equals " + divde(16, 4));
        System.out.println("956 divide 37 equals " + divde(956, 37));
        System.out.println("333.154 divide 2.51 equals " + divde(333.154f, 2.51f));
        System.out.println("-125 divide 165 equals " + divde(-125, 165));
    }
}


    
