package Java;

public class Operators
{
    public static void main(String[] args)
    {
        // Arithmetic using integers
        int a = 1 + 1;
        int b = a * 2;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        // Arithmetic using doubles
        double da = 1 + 1;
        double db = a * 2;
        double dc = b / 4;
        double dd = c - a;
        double de = -d;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);

        //Modulus Operator
        int x = 42;
        double y = 42.25;

        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);
    }
}
