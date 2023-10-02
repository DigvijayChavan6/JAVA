import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Cal{
    JFrame f; 

    JTextField inp;
    JTextField outp;

    JButton add;
    JButton sub;
    JButton mul;
    JButton div;
    JButton mod;

    JButton zero;
    JButton dot;
    JButton equal;
    JButton clear;
    JButton resto;
    

    JButton one;
    JButton two;
    JButton three;
    JButton four;
    JButton five;
    JButton six;
    JButton seven;
    JButton eight;
    JButton nine;
    

    Cal(){
        f=new JFrame("Calculator");
        f.setVisible(true);
        f.setSize(400,500);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        inp=new JTextField();
        outp=new JTextField();

        equal=new JButton("=");
        clear=new JButton("x");
        dot=new JButton(".");
        resto=new JButton("^");

        add=new JButton("+");
        sub=new JButton("-");
        mul=new JButton("*");
        div=new JButton("/");

        zero=new JButton("0");
        one=new JButton("1");
        two=new JButton("2");
        three=new JButton("3");
        four=new JButton("4");
        five=new JButton("5");
        six=new JButton("6");
        seven=new JButton("7");
        eight=new JButton("8");
        nine=new JButton("9");

        f.setLayout(null);

        inp.setBounds(0, 0, 400, 70);
        outp.setBounds(0, 70, 400, 70);

        one.setBounds(0, 140, 80, 80);
        two.setBounds(80, 140, 80, 80);
        three.setBounds(160, 140, 80, 80);
        add.setBounds(240, 140, 80, 80);
        
        
        

        f.add(inp);
        f.add(outp);

        f.add(one);
        f.add(two);
        f.add(three);
        f.add(add);
    }
    public static void main(String[] args) {
        new Cal();
    }
}
    
