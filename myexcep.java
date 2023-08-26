public class myexcep {
    public static void main(String []args){
        int a=9;
        try{
            a=10/1;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("Error by Digvijay:"+e.getMessage());
        }
    }
}