import java.util.*;
class SmallestNum
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        int numb= s.nextInt();
        int [] arr = new int [numb];
        for (int i=0; i < numb ; i++)
        {
            arr[i]=s.nextInt();

        }
        int smallest= arr[0];
        for(int i=1; i<numb;i++)
        {
            if (arr[i] < smallest)
            {
                smallest=arr[i];

            }
        }
        System.out.println(smallest);
    }
}