import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Vector;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;

public class twolist {
    JFrame f; 

    DefaultListModel<String> dl1;
    DefaultListModel<String> dl2;

    JList<String> lst1;
    JList<String> lst2;

    JButton ri;
    JButton lf;
    JButton ari;
    JButton alf;

    twolist(){
        Color cl=new Color(90,90,90);
        Color ls=new Color(120,120,120);
        
        f=new JFrame("Transfer Data");
        ri=new JButton(">");
        lf=new JButton("<");
        ari=new JButton(">>");
        alf=new JButton("<<");

        ri.setBackground(cl);
        lf.setBackground(cl);
        ari.setBackground(cl);
        alf.setBackground(cl);

        String []lt= {"Pandharpur","Sangli","Jath","Lohgoan","Chavanwadi"};
		String []tl= {"Sangola","Miraj","Pune","Kolhapur","Kadlas","Vadegoan"};

        
        dl1=new DefaultListModel<>();
        dl2=new DefaultListModel<>();

        for(String s : lt)dl1.addElement(s);
        for(String s : tl)dl2.addElement(s);
        
        lst1=new JList<>(dl1);
        lst2=new JList<>(dl2);

        lst1.setBackground(ls);
        lst2.setBackground(ls);

        f.setSize(500, 500);
        f.getContentPane().setBackground(Color.black);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        lst1.setBounds(20, 20, 150, 200);
        lst2.setBounds(300, 20, 150, 200);

        lf.setBounds(210, 20, 50, 30);
        ri.setBounds(210, 70, 50, 30);
        alf.setBounds(210, 120, 50, 30);
        ari.setBounds(210, 170, 50, 30);


        f.add(lst1);
        f.add(lst2);
        
        f.add(lf);
        f.add(ri);
        f.add(alf);
        f.add(ari);

        ri.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(!lst1.isSelectionEmpty()){
                    String s=dl1.getElementAt(lst1.getSelectedIndex());
                    dl1.removeElement(s);
                    dl2.addElement(s);
                }
            }
        });
        lf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(!lst2.isSelectionEmpty()){
                    String s=dl2.getElementAt(lst2.getSelectedIndex());
                    dl2.removeElement(s);
                    dl1.addElement(s);
                }
            }
        });
        alf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int len=dl2.getSize();
                for(int i=0;i<len;i++)dl1.addElement(dl2.getElementAt(i));
                dl2.clear();
            }
        });
        ari.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                int len=dl1.getSize();
                for(int i=0;i<len;i++)dl2.addElement(dl1.getElementAt(i));
                dl1.clear();
            }
        });
        
    }
    public static void main(String[] args) {
        new twolist();
    }
}
