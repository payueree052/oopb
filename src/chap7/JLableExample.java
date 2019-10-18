package chap7;

import java.awt.Font;
import javax.swing.*;

public class JLableExample extends JFrame {

    public static void main(String[] args) {
        JFrame frm;
        JPanel pnl;
        JLabel lbl1, lbl2;

        frm = new JFrame("JFrame");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrameExample.EXIT_ON_CLOSE);

        lbl1 = new JLabel("I love Object-Oriented Programming");
        lbl1.setFont(new Font("Tohoma", Font.PLAIN, 14));
        lbl2 = new JLabel("I love Java GUI");
        lbl2.setFont(new Font("Tohoma", Font.BOLD, 16));

        pnl = new JPanel();
        pnl.add(lbl1);
        pnl.add(lbl2);

        frm.add(pnl);
        frm.setVisible(true);
    }
}
