package chap7;

import java.awt.Color;
import javax.swing.*;

public class JButtonExample extends JFrame {

    public static void main(String[] args) {
        JFrame frm;
        JPanel pnl;
        JButton btnOk, btnCancel, btnExit;
        
        frm = new JFrame("JButton Example");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        btnOk = new JButton("OK");
        btnCancel = new JButton("Cancel");
        btnExit = new JButton("Exit");
        btnExit.setBackground(Color.ORANGE);
        
        pnl = new JPanel();
        pnl.add(btnOk);
        pnl.add(btnCancel);
        pnl.add(btnExit);
        
        frm.add(pnl);
        frm.setVisible(true);
    }
}
