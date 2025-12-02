
class ReverseNumber
{
    public static void main(String[]args)
    {
        int number=12345;
        int rev=0;
        while(number != 0)
        {
            int LastNumber = number %10;
            rev= rev*10+LastNumber;
            number= number/10;
        System.out.println("Reverse Number :"+ rev);
        }
    }
}