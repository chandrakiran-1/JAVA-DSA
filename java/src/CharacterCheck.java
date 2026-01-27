import java.util.*;
class CharacterCheck
{
    public  static void main(String[]args)
{
    Scanner q = new Scanner(System.in);
    System.out.println("Enter a Character : ");
    String c= q.nextLine();
    if(isAlpha(c))
    {
        System.out.println("is String : " + c);
    }
    else
    {
        System.out.println("not a String : " + c);
    }


}
    public static boolean isAlpha(String c)
    {
        return c.matches("[a-zA-z]+");
    }

}