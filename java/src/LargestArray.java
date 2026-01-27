import java.util.*;
class LargestArray
{
    public static void main(String[]args) {
        Scanner x = new Scanner(System.in);
        int num = x.nextInt();
        int[] arr = new int[num]; // creating an array of storing of n number of values which user entered.
        for (int i = 0; i < num; i++) {
            arr[i] = x.nextInt();
        }
        int largest = arr[0];
        for (int i = 1; i < num; i++)
        {
            if (arr[i]> largest)
            {
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
}