package ARRAYS;

import java.util.Arrays;
import java.util.Scanner;

public class ARRAY {
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        int [][]y= new int[3][3];
        // input
        for(int row=0;row<y.length;row++)
        {
            for(int col=0;col<y[row].length;col++)
            {
                y[row][col]=x.nextInt();
            }
        }

      /*  //output
        for(int row=0;row<y.length;row++)
        {
            for(int col=0;col<y[row].length;col++)
            {
                System.out.print(y[row][col]+ " ");
            }

            System.out.println();
        }
        */


     /*  for (int row=0;row<y.length;row++)
        {
            System.out.println(Arrays.toString(y[row]));
        } */
        //for each
        for (int []arr : y)
        {
            System.out.println(Arrays.toString(arr));
        }
    }
}
