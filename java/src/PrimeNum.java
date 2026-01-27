import java.util.*;
class PrimeNum
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter  a number : ");
        int num=s.nextInt();
        boolean prime= true;
        if(num<=1)
        {
            prime = false;
        }
        for(int i=1;i<=num/2;i++)
        {
            if(num%i==0)
            {
                prime=false;
                break;
            }
        }if (prime)        System.out.println("prime ");
          else             System.out.println("Not a prime ");
    }
}