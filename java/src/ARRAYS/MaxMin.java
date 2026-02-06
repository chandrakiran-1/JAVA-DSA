package ARRAYS;
import java.util.*;

public class MaxMin {
    public static void main(String[]args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the Array Size :  ");
        int size=x.nextInt();
        int [] arr= new int [size];
        System.out.println("Enter the Array Elements : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=x.nextInt();
        }
        int max=arr[0];
        int min=arr[0];
        for( int i=0;i<arr.length;i++)
        {
            if(arr[i]> max)
            {
                max=arr[i];
            } else if (arr[i]< min) {
                min=arr[i];

            }
        }
        System.out.println("Max Element : "+ max);
System.out.println("Min Element : " + min);
}
}
