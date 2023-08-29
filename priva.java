class priva{
    private int x=10,y;
    public int my(){
        System.out.println("Dear,");
        return x;
    }
    public static void main(String[] args) {
        priva o=new priva();
        System.out.println(o.x);
        p op=new p();
        float f=(float)90.35;
        double d=2.4;
        byte a=13;
        System.out.println(a);
    }
}
class p{
    p(){
        priva o=new priva();
        o.my();
        System.out.println();
    }
}