 import java.util.*;
 public class Thiskeyword1{
    void display()
    {
        System.out.println("Hello Hii....");
    }
    void dis1()
    {
        this.display();
    }
    public static void main(String args[]){
        Thiskeyword1 a=new Thiskeyword1();
        a.dis1();
    }
 }