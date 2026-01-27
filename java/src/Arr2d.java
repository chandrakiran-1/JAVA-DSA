import java.util.*;
class Arr2d
{
    public static void main(String[]args)
    {
        Scanner x = new Scanner(System.in);
        int [][] a= new int [3][3];
        // input
        for (int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=x.nextInt();
            }
        }
        //output
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.println(a[i][j] + " ");
            }
        }
    }
}