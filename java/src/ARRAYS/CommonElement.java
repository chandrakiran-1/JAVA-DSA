package ARRAYS;

import java.util.HashSet;
import java.util.Scanner;

public class CommonElement {
    public static void main(String[]args)
    {
        Scanner x = new Scanner(System.in);
        int n=x.nextInt();
        int [] a= new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=x.nextInt();
        }
        int m=x.nextInt();
        int[]b=new int [m];
        for(int i=0;i<m;i++)
        {
            b[i]=x.nextInt();
        }
        HashSet<Integer> set= new HashSet<>();
        for(int i=0;i<n;i++)
        {
            set.add(a[i]);
        }
        HashSet<Integer> common= new HashSet<>();
        for(int i=0;i<m;i++)
        {
            if(set.contains(b[i]))
            {
                common.add(b[i]);
            }
        }
        for(int val : common)
        {
            System.out.print(val + " ");
        }
    }
}
