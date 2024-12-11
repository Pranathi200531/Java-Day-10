class recursive{
    int mul(int n)
    {
        if(n==1)return 1;
        return n*mul(n-1);
    }
    public static void main(String args[]){
        recursive b=new recursive();
        int res=b.mul(10);
        System.out.println(res);
    }
}