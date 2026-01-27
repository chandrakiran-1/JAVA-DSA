 /*Given an integer array nums where every element appears two times except for one, which appears exactly once. Find the single element and return it.

You must implement a solution with a linear runtime complexity and use only constant extra space.
Example 1:

Input: 3
        2 2 3
Output: 3
Example 2:

Input:
        7
        0 1 0 1 2 99 2
Output: 99

  */

 import java.util.*;
 class DELLO3
 {
     public static void main(String[]args)
     {
         Scanner x = new Scanner(System.in);
         int n = x.nextInt();
         int[] arr = new int[n];

         for (int i = 0; i < n; i++)
         {
             arr[i] = x.nextInt();
         }

         for (int i = 0; i < n; i++)
         {
             int count = 0;

             for (int j = 0; j < n; j++)
             {
                 if (arr[i] == arr[j]) {
                     count++;
                 }
             }

             if (count == 1)
             {
                 System.out.println(arr[i]);
                 break;
             }
         }
         x.close();
     }
 }
