class Methodoverloading{
    static void a()
    {
        System.out.println("Hello");
    }
    static void a(int b)
    {
        System.out.println("Hello"+b);        
    }
    static void a(int b,int c,String h)
    {
        System.out.println("Hello"+b+" "+c+" "+h+" "+);
    }
    public static void main(String args[]){
    
     a();
     a(5);
     a(4,6 ,Paa);
    }
}