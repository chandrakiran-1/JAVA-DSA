package ARRAYS;
import java.util.*;

public class MinMax {
    public static void main(String[]args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the size of the Array : ");
        int size = x.nextInt();
        System.out.println("Enter the Array Elements : ");
        int []arr;
        int max;
        int min;
        arr= new int[size];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=x.nextInt();
        }
        max= arr[0];
        min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i] > max)
            {
                max=arr[i];

            }
            else if( arr[i] < min)
            {
                min=arr[i];

            }
        }
        System.out.println("Max : " + max);
        System.out.println("Min : " + min);


    }
}
