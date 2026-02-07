package ARRAYS;

public class ArrayAppp {
    public static void main(String[] args)
    {
        long [] arr;
        arr= new long[100];
        int nElemns;
        int j=0;
        long searchKey;
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
        nElemns=10;
        for(j=0;j<nElemns;j++)
        {
            System.out.print(arr[j]+ " ");
            System.out.println(" ");
        }
        searchKey=38;
        for(j=0;j<nElemns;j++)
        {
            if(arr[j]==searchKey)
            {
                System.out.println("Elemet is Found : ");
                break;
            }
        }
        for(int k=j;k<nElemns-1;k++)
        {
           arr[k]=arr[k+1];
           System.out.println(arr[k]);
           break;

        }

    }
}
