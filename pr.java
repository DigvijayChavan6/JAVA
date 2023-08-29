class A{
    int a;
    private int b;
    void fill(int a,int b){
        this.a=a;
        this.b=b;
    }
    int gt(){
        return b;
    }
}
class pr extends A {
    int total;
    void  sum(){
        this.total=this.a+this.gt();
    }
    public static void main(String[] args) {
        A ob=new A();
        ob.fill(20, 30);
        pr o=new pr();
        o.fill(10,4560);
        o.sum();
        System.out.println(o.total);
    }
}
