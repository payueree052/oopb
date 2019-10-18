package chap7;

import javax.swing.*;

public class JComboBoxExample extends JFrame {

    public static void main(String[] args) {
        JFrame frm;
        JPanel pnl;
        JComboBox cbx1, cbx2;
        
        frm = new JFrame("JComboBox Example");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        String sex[] = {"male", "female"};
        String status[] = {"single", "married", "widowed", "divirce"};
        cbx1 = new JComboBox(sex);
        cbx2 = new JComboBox(status);
        cbx2.setSelectedIndex(1);
        
        pnl = new JPanel();
        pnl.add(cbx1);
        pnl.add(cbx2);
        
        frm.add(pnl);
        frm.setVisible(true);
    }
}
