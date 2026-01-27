import java.util.*;
class Fibonacci
{
    public static void main(String[]args)
    {
        Scanner x = new Scanner (System.in);
        System.out.println("Enter a Number : ");
        int num=x.nextInt();
        int a=0;
        int b=1;
        System.out.println(a + " " + b + " ");
        for (int i=2;i<num;i++)
        {
            int c= a+b;
            System.out.println(c + " ");
            a=b;
            b=c;

        }
    }
}