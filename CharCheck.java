import java.util.*;
class IsAlpha
{
    public static void main(String[]args)
    {
        Scanner c= new Scanner(System.in);
        System.out.println("Enter a character : ");
        String string= c.nextLine();
        if (isAlpha(string))
        {
            System.out.println("String" + string);
        }
        else
        {
            System.out.println("not a String " + string);
        }
        public static boolean isAlpha(String string)
        {
                return string.matches("[a-zA-z] + ");
        }
    }
}