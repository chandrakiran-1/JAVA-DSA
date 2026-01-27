import java.util.*;
class SmallestNumm
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int []a = new int[n];
        for (int i=0; i<n; i++)
        {
            a[i]=s.nextInt();
        }
        int num=a[0];
        for (int i=1; i<n;i++)
        {
            if (a[i]<num)
            {
                num=a[i];
            }
        }
        System.out.println(num);
    }
}