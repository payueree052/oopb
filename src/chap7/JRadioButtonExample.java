package chap7;

import javax.swing.*;

public class JRadioButtonExample extends JFrame {

    public static void main(String[] args) {
        JFrame frm;
        JPanel pnl;
        ButtonGroup btnGroup;
        JRadioButton rdo1, rdo2, rdo3, rdo4;
        
        frm = new JFrame("JRadioButton Example");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        rdo1 = new JRadioButton("Project Manager");
        rdo2 = new JRadioButton("System Analyst");
        rdo3 = new JRadioButton("Programming", true);
        rdo4 = new JRadioButton("Webmaster");
        
        btnGroup = new ButtonGroup();
        btnGroup.add(rdo1);
        btnGroup.add(rdo2);
        btnGroup.add(rdo3);
        btnGroup.add(rdo4);
        
        pnl = new JPanel();
        pnl.add(rdo1);
        pnl.add(rdo2);
        pnl.add(rdo3);
        pnl.add(rdo4);
        
        frm.add(pnl);
        frm.setVisible(true);
    }
}
