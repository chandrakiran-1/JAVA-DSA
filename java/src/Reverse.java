import java.util.*;
class Reverse
{
    public static void main(String[]args)
    {
        Scanner varma = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=varma.nextInt();
        int rev=0;
        while (num>0)
        {
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);
    }
}