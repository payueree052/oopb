
package chap7;

import javax.swing.*;

public class JCheckBoxExample extends JFrame {
    public static void main(String[] args) {
        JFrame frm;
        JPanel pnl;
        JCheckBox chk1, chk2, chk3;
        
        frm = new JFrame("JCheckBox Example");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        chk1 = new JCheckBox("Basic programming");
        chk2 = new JCheckBox("Object-Oriented programming");
        chk3 = new JCheckBox("Web programming");
        chk2.setSelected(true);
        
        pnl = new JPanel();
        pnl.add(chk1);
        pnl.add(chk2);
        pnl.add(chk3);
        
        frm.add(pnl);
        frm.setVisible(true);
    }
}
