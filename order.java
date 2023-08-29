class A{
    A(){
        int a=90;
        System.out.println("In A :"+a);
    }
}
class B extends A{
    B(int c){
        int bc=100;
        System.out.println("In B :"+c);
    }
}
class order extends B{
    order(int c){
        super(40);
        int o=130;
        System.out.println("In C :"+o);
    }
    public static void main(String[] args) {
        order obj=new order(13);
        int THIS=78;
    }
}