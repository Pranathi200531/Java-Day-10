import java.util.*;
public class Thiskeyword2{
    String name;
    Thiskeyword2(String args[])
    {
        this.name=name;
    }
    void dis1()
    {
        System.out.println(name);
    }
    void agt()
    {
        teacher s=new teacher();
        s.teach(this);
    }
    public static void main(String args[])
    {
        Thiskeyword2 a=new Thiskeyword2("Kim teahyung");
        a.agt();
    }
}
class Teacher{
    public static void teach(Main s)
    {
        s.dis1();
    }
}