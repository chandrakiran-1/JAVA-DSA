import java.util.*;
class LargerNumArr
{
    public static void main(String[]args)
    {
        Scanner w = new Scanner (System.in);
        int n= w.nextInt();
        int []arr= new int[n];
        for (int i =0;i<n;i++)
        {
            arr[i]= w.nextInt();

        }
        int large=arr[0];
        for(int i=1;i<n;i++)
        {
            if (arr[i]> large)
            {
                large=arr[i];
            }
        }
        System.out.println(large);
    }
}