import java.util.*;
class Prime
{
    public static void main(String[]args)
    {
        Scanner r=  new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num=r.nextInt();
        boolean prime= true;
        if(num<1)
        {
            prime=false;

        }
        for(int i=1;i<num /2; i++)
        {
            if(num%2==0)
            {
                prime=false;
                break;
            }
        }
        if(prime)  System.out.println("Prime");
        else       System.out.println("Not a Prime");
    }
}