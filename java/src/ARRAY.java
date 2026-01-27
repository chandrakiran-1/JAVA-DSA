import java.lang.reflect.Array;
import java.util.*;
class ARRAY
{
    public static void main(String[]args)
    {
        Scanner q = new Scanner (System.in);
       /*  int [] a= new int [4];
        for (int i=0;i<a.length;i++)
        {
            a[i]=q.nextInt();
        }
        for ( int n : a){
            System.out.print(n + " ");
        }
        System.out.println(Arrays.toString(a)); */

        // array of objects
        String [] s= new String[4];
        for ( int i=0;i<s.length;i++)
        {
            s[i]=q.next();
        }
        System.out.println(Arrays.toString(s));
        // modifying the string
        s[1]="Chandu ";
        System.out.println(Arrays.toString(s));
    }

}