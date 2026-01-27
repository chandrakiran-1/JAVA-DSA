import java.util.*;
class HappyNum
{
    public static int sumOfsquares(int n)
    {
        int sumof=0;
        while(n>0)
        {
            int digit= n%10;
            sumof= sumof+digit*digit;
            n/=10;
        }
        return sumof;
    }
}
public static void main(String[] args)
{
    Scanner x= new Scanner (System.in);
    System.out.println("enter a number :");
     int n =x.nextInt();
     int slow=n;
     int fastin=n;
     do{
         slow= HappyNum.sumOfsquares(slow);
         fastin= HappyNum.sumOfsquares(HappyNum.sumOfsquares(fastin));
     }while(slow!=fastin);
     if (slow ==1)
     {
         System.out.println("happy NUm");

     }
     else
     {
         System.out.println("not a happy Num");
     }
    }