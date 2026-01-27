/* Read “n” elements into array. Print Maximum element in an array.

        Example:

        Input:

        5

        1 2 4 5 8

        Output:

        8
 */



import java.util.*;
class DELLO5
{
    public static void main(String[]args)
    {
        Scanner w = new Scanner (System.in);
        int n= w.nextInt();
        int []arr= new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]= w.nextInt();
        }
        int max=arr[0];
        for (int i=1;i<n;i++)
        {
            if(arr[i] > max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}