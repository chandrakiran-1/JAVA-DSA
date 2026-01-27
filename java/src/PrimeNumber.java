import java.util.*;

class PrimeNumber {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = a.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }                                               // count is used to define the divisor.

        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }

}
