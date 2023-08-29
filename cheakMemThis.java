
class cheakMemThis{
    static int n;
    char ch;
    cheakMemThis(){
        this(10);
        System.out.println("cons");
    }
    cheakMemThis(int v){
        //this();
        System.out.println("para cons with value "+v);
        System.out.println("Dear,");
    }
    void my(int i,char c){
        //static int v=90; Invalid statement
        this.n=i;
        ch=c;
    }
    void pri(){
        System.out.println("n is "+n);
        System.out.println("ch is "+ch);
    }
    public static void main(String[] args) {
        
        cheakMemThis ob=new cheakMemThis(3);
        cheakMemThis bo=new cheakMemThis(5);
        ob.my(90,'a');
        bo.my(120, 'b');
        bo.pri();
        ob.pri();
        int k=-3;
        int a=Math.abs(k);
        System.out.println(a);

    }
}
