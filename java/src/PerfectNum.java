import java.util.*;
class   PerfectNum
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=s.nextInt();
        int sum=0;
        for(int i=1; i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }if (sum==num)    System.out.println("Perfect num");
        else                System.out.println("Not a Perfect Num : ");
    }
}