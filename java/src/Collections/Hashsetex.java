package Collections;

import java.util.HashSet;

public class Hashsetex {
    public static void main(String[]args)
    {
        int []arr={ 1,2,3,4,5,6};
        HashSet<Integer> s= new HashSet<>();
        for (int a: arr)
        {
            s.add(a);
            System.out.println(s);
        }

    }
}
