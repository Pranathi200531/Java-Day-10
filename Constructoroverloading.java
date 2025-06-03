import java.util.*;
public class Constructoroverloading{
    String name;
    Constructoroverloading()
    {
        name="Rajasekhar";
    }
    Constructoroverloading(String name)
    {
        this.name=name;
    }
    void display()
    {
        System.out.println(name);
    }
    public static void main(String args[])
    {
        Constructoroverloading a=new Constructoroverloading();
        a.display();
        Constructoroverloading a1=new Constructoroverloading("Pranathi");
        a1.display();

    }
}