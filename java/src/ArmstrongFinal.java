import java.util.*;
class ArmstrongFinal
{
    public static void main(String[]args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=x.nextInt();
        int temp=num;
        int sum=0;
        int digits=0;
        while(temp>0)
        {
            digits++;
            temp/=10;
        }
        temp=num;
        while(temp>0)
        {
            int d = temp%10;
            sum= sum+(int)Math.pow(d,digits);
            temp/=10;
        }
        if (sum== num)
        {
            System.out.println("Armstrong");
        }
        else {
            System.out.println(("Not a Armstrong"));
        }
    }
}