import java.util.*;
class Main
{
    public static void main(String[]args)
    {
        Scanner x = new Scanner(System.in);
        int num= x.nextInt();
        int []arr= new int [num];
        for (int i=0; i < num;i ++)
        {
            arr[i]=x.nextInt();
        }
        int N= x.nextInt();
        for (int i=0;i<num;i++)
        {
            if (i >0 )   System.out.println(" ");
            int result= arr[i] >> N;
            System.out.println(result);

        }
    }
}