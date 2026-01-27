import java.util.*;
class LargestNum
{
    public static void main(String[]args)
    {
        Scanner w = new Scanner(System.in);
        int n = w.nextInt();
        int []a= new int [n];
        for (int i=0; i<n;i++)
        {
            a[i]=w.nextInt();
        }
        int Largest= Integer.MIN_VALUE;
        int SecondLargest= Integer.MIN_VALUE;
        for (int i=1; i<n; i++)
        {
            if(a[i]> Largest)
            {
                SecondLargest=Largest;
                Largest=a[i];
            }

            else if(a[i] > SecondLargest && a[i] != Largest) {
                SecondLargest= a[i];
            }

        }
        System.out.println(SecondLargest);

    }
}