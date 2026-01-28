import java.util.*;
class LinearSearch
{
    public static void main(String[]args)
    {
        int [] arr= { 2,4,6,8,9};
        int target= 8;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
            {
                System.out.println("ELement is founded : " + arr[i]);
            }
            else {
                System.out.println("Not found");
            }
        }
    }
}