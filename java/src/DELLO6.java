import java.util.*;
class DELLO6
{
    public static void main(String[]args)
    {
        Scanner x = new Scanner (System.in);
        int n= x.nextInt();
        int []a= new int[n];
        for (int i=0;i<n;i++)
        {
            a[i]=x.nextInt();
        }
        for (int i=0;i<n;i++)
        {
            int count =0;
            {
                for(int j=0;j<n;j++)
                {
                    if (a[i]==a[j]){
                        count ++;
                    }
                }
            } if (count >1) {
                System.out.println(a[i]);
                break;
        }
        }


    }
}