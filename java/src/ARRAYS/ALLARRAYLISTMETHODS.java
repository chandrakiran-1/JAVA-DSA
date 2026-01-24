package ARRAYS;

import java.util.ArrayList;

public class ALLARRAYLISTMETHODS {
    public static void main(String[]args)
    {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.get(2));
        list.set(2,99);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.remove(1));
        System.out.println(list.contains(99));
        list.clear();
        System.out.println(list);


    }
}
