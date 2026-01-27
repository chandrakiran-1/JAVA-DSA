import java.util.*;
class ARR
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner (System.in);
        int []arr= new int[4];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        for (int n : arr)
        {
            System.out.print(n + " ");
        }
    }
}