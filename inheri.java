
class inheri extends inh{
    public static void main(String[] args) {
        inh obj = new inh(); //error
        inh b=new inh();
        obj.x=90;
        b.x=67;
        obj.my();
        b.my();
    }
}
