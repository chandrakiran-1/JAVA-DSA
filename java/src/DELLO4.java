// a program to print the missing element in an array.
import java.util.*;
class DELLO4
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner (System.in);
        int n = x.nextInt();
       int arraysum=0;
       for (int i=0;i<n-1;i++)
       {
           int value= x.nextInt();
           arraysum=arraysum + value;
       }
       int total= n*(n+1)/2;
       int missing = total- arraysum;
       System.out.println(missing);
    }
}