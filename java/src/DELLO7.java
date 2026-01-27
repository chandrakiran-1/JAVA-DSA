import java.util.*;
class DELLO7
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner (System.in);
        int t = s.nextInt();
        while(t > 0)
        {
            int N=s.nextInt();
            int count=0;
            for (int num=2; num <=N; num++ )
            {
                boolean isPrime= true;
                for (int i=2;i<num;i++)
                {
                    if (num%i==0)
                    {
                        isPrime=false;
                        break;
                    }
                }if(isPrime){
                count++;
            }
            }
            System.out.println(count);
            t--;


        }
    }
}