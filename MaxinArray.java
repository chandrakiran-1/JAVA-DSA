import java.util.*;

class MaxInArray {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        System.out.println("Enter Size of an Array:");
        int n = x.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {    // start from 0, go to n-1
            arr[i] = x.nextInt();
        }

        int max = arr[0];               // assume first element is max

        for(int i = 1; i < n; i++) {    // start from 1, go to n-1
            if(arr[i] > max) {
                max = arr[i];           // update max if bigger
            }
        }

        System.out.println("Max Number: " + max);
    }
}
