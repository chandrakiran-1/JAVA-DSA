import java.util.*;
class LinearsearchEx
{
    public static void main(String[]args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the Array  Size ? : ");
        int n= x.nextInt();
        int []a= new int [n];
        for(int i=0;i<a.length;i++)
        {
            a[i]=x.nextInt();
        }
        System.out.println("Enter the Array List of Items : ");
        int key= x.nextInt();
        boolean found= false;
        for(int i=0;i<a.length;i++)
        {
            if(key==a[i])
            {
                System.out.println("The Element is Found : " + a[i]);
                found= true;
                break;
            }

        } if(!found)
    {
        System.out.println(" Element was Not Found ");
    }
    }
}