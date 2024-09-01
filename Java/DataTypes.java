package Java;

public class DataTypes
{

    public static void main(String[] args)
   {

       //Integers
       int num = 10;
       int someNum;
       int aNum = 1, bNum;

       //Floating-point
       double decNum = 10.1111;
       double someDecNum;
       double aDecNum = 1.55, bDecNum;

       //Characters
       String characters = "Hi";
       String someCharacters;
       String acharacters = "Hi", bcharacters;

       //Boolean
       boolean isYesNo = true;
       boolean yesNo; //will initialize as false
       boolean aisYesNo = false, bisYesNo;

       //Block scope
       class scope {
           public static void scope()
           {
               int x; //Known to all code within main

               x = 10;
               if (x == 10)
               { //Start of new scope
                   int y = 20;

                   //x and y both know here
                   System.out.println("x and y: " + x + " " + y);
                   x = y * 2;
               }
               int y = 100; //Error! y not know here

               // x is still known here
               System.out.println("x is " + x);
           }
       }

       //Note when something is made in the scope it will also be lost when the scope is left (values and variables)

       //Arrays declaration
       int[] a;
       a = new int[3]; //Init as 0

       double[] b;
       b = new double[4]; //Init as 0

       String[] c;
       c = new String[1]; //Init as null

       boolean[] d;
       d = new boolean[2]; //Init as false

       //Arrays setting values
       a[0] = 10; //Setting value to the arrays memories
       a[1] = 9;
       a[2] = 8;

       b[0] = 1.1;
       b[1] = 1.2;
       b[2] = 1.3;
       b[3] = 1.4;

       c[0] = "Hi";

       d[0] = false;
       d[1] = true;

       //Using Arrays

       System.out.println(a[0]);
       System.out.println(b[1]);
       System.out.println(c[0]);
       System.out.println(d[1]);

       //Other declaration
       int[] aBetter1 = new int[3];
       int aBetter2 [] = new int[3];

       int[] aBest = {
               10,9,8,7,6,
       };



   }
}