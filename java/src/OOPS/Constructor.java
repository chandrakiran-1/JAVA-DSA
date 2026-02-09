package OOPS;

public class Constructor {
    int id;
    String name;
    Constructor(int i , String n )
    {
        id=i;
        name =n;
    }
    void display()
    {
        System.out.println(id + " , " + name);
    }
    public static void main(String[] args)
    {
        Constructor c = new Constructor(001, "Chandu");
        c.display();
    }


}
