import java.util.*;
class Armstrong
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number= s.nextInt();
        int temp= number;
        int sum=0;
        int digits=0;
        while(temp>0)
        {
            digits++;
            temp=temp/10;
        }
        temp=number;
        while(temp>0)
        {
            int d= temp%10;
            sum=sum+(int)Math.pow(d,digits);
            temp=temp/10;
        }
        if (sum==number)
        {
            System.out.println("Armstrong:");

        }
        else {
            System.out.println("Not An Armstrong:");
        }
    }
}