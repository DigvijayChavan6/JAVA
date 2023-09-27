import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class mycombo {
    JFrame f; 

    JComboBox<String> lst1;
    JComboBox<String> lst2;

    JLabel lb1;
    JLabel lb2;

    JButton prlf;
    JButton prri;

    mycombo(){
        Color cl=new Color(90,90,90);
        Color ls=new Color(120,120,120);
        Color ft=new Color(135,135,135);
        
        f=new JFrame("Combobox item Selection");
        f.setSize(500, 300);
        f.getContentPane().setBackground(ft);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);


        prlf=new JButton(">");
        prri=new JButton("<");
       
        lb1=new JLabel();
        lb2=new JLabel();

        prlf.setBackground(cl);
        prri.setBackground(cl);

        lb1.setBackground(cl);
        lb2.setBackground(cl);
        
        String []lt= {"Pandharpur","Sangli","Jath","Lohgoan","Chavanwadi"};
		String []tl= {"Sangola","Miraj","Pune","Kolhapur","Kadlas","Vadegoan"};
        
        lst1=new JComboBox<>(lt);
        lst2=new JComboBox<>(tl);

        lst1.setBackground(ls);
        lst2.setBackground(ls);

        lb1.setBounds(20, 200, 150, 70);
        lb2.setBounds(300, 200, 150, 70);
        

        lst1.setBounds(20, 20, 150, 30);
        lst2.setBounds(300, 20, 150, 30);

        prlf.setBounds(210, 20, 50, 30);
        prri.setBounds(210, 70, 50, 30);
        
        f.add(lb1);
        f.add(lb2);

        f.add(lst1);
        f.add(lst2);
        
        f.add(prlf);
        f.add(prri);

        prlf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String s=lst1.getSelectedItem().toString();
                lb1.setText(s);
            }
        });
        prri.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                String s=lst2.getSelectedItem().toString();
                lb2.setText(s);
            }
        });
        
    }
    public static void main(String[] args) {
        new mycombo();
    }
}