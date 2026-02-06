
package ARRAYS;

public class ArrayApp {
    public static void main(String[]args)
    {
        long [] arr;
        arr= new long[100];
        int nElemens;
        int j=0;
        long searchkey;
        arr[0]=100;
        arr[1]=99;
        arr[2]=45;
        arr[3]=67;
        arr[4]=78;
        arr[5]=88;
        arr[6]=53;
        arr[7]=12;
        arr[8]=38;
        arr[9]=24;
        nElemens=10;
        for( j=0;j<nElemens;j++) {
            System.out.print(arr[j] + " ");
            System.out.println(" ");
        }
        searchkey=12;
        for(j=0;j<nElemens;j++)
        {
            if(arr[j]==searchkey)
            {
                System.out.print("Element is found : " + arr[j] + " " + searchkey);
                break;
            }
        }
        for(int k=j; k<nElemens-1;k++)
        {
            arr[k]=arr[k+1];

            System.out.println(arr[k]);
        }
        nElemens--;


    }
}
