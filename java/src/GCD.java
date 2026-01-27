import java.util.*;
class GCD
{
    public static void main(String[]args)
    {
        Scanner q= new Scanner(System.in);
        System.out.println("Enter a , b  Numbers : ");
        int a= q.nextInt();
        int b= q.nextInt();
        int gcd=1;
        for (int i=1;i<=a && i<=b; i++)
        {
            if (a%i==0 && b%i==0)
            {
                gcd=i;
            }
        }System.out.println("gcd is : " + gcd);
    }
}