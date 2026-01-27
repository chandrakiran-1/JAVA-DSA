import java.util.*;
class LargerNum
{

    public static void main(String[]args)
    {
        Scanner x= new Scanner(System.in);
        int n= x.nextInt();
        int []q= new int [n];
        for(int i=0;i<n;i++)
        {
            q[i]=x.nextInt();
        }
        int Secondlarge=Integer.MIN_VALUE;
        int Large=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if ( q[i]> Large)
            {
                Secondlarge=Large;
                Large=q[i];

            } else if (q[i] > Secondlarge && q[i]!=Secondlarge) {
                Secondlarge=q[i];

            }
        }
        System.out.println(Secondlarge);

    }
}