package patterns;

import java.util.Scanner;

public class STAR {
    public static void main(String[]args)
    {
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
