import java.util.*;
class Palindrome
{
    public static void main(String[]args)
    {
        Scanner y= new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int x=y.nextInt();
        int temp=x;
        int rev=0;
        while (temp > 0)
        {
            rev=rev*10+temp%10;
            temp/=10;
        }
        if(x==rev)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome");
        }
    }
}