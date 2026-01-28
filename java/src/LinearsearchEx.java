import java.util.*;
class LinearsearchEx
{
    public static void main(String[] args)
    {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter the Array Size : ");
        int n = x.nextInt();
        System.out.println("Enter the Array Elements : ");
        int []arr= new int [n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=x.nextInt();
        }
        System.out.println("Enter the Element is to find ? ");
        int key= x.nextInt();
        boolean find = false;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==key)
            {
                System.out.println("Element is Found : "+ arr[i]);
                find=true;
                break;

            }

        }
        if (!find) {
            System.out.println("not Found ");

        }
    }
}