import java.util.*;
class ReversedNum
{
    public static void main(String[]args)
    {
        Scanner w= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=w.nextInt();
        int rev=0;
        while(num>0){
            rev= rev*10+num%10;
            num=num/10;
        }
        System.out.println("Reversed num is : "+ rev);
    }
}