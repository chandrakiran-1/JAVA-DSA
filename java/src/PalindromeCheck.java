import java.util.*;
class PlaindromeCheck
{
    public static void main(String[]args)
    {
        Scanner r= new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=r.nextInt();
        int temp=num;
        int rev=0;
        while(temp>0)
        {
            rev=rev*10+temp%10;
            temp/=10;
        }
        if(num==rev)
        {
            System.out.println("Palindrome");

        }
        else {
            System.out.println("Not a Palindrome : ");
        }
    }

}