package chap7;

import java.awt.Color;
import javax.swing.*;

public class JPanelExample extends JFrame {

    public static void main(String[] args) {
        JFrame frm;
        JPanel pnl;

        frm = new JFrame("JPanel Exaple");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrameExample.EXIT_ON_CLOSE);

        pnl = new JPanel();
        pnl.setBackground(Color.yellow);

        frm.add(pnl);
        frm.setVisible(true);
    }
}
