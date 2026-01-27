import java.util.*;
class StrongNum
{
    public static void main(String[]args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=s.nextInt();
        int temp=num;
        int sum=0;
        while(temp>0)
        {
            int d = temp%10;
            int fact=1;
            for(int i =1; i<=d;i++)
            {
                fact=fact*i;
            }
                sum=sum+fact ;
                temp=temp/10;

        }
        if(sum==num)  System.out.println("Strong Number : ");
        else          System.out.println("Not a  Strong Number : ");
    }
}