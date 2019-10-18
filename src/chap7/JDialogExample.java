package chap7;

import javax.swing.*;

public class JDialogExample extends JFrame {

    public static void main(String[] args) {
        JFrame frm;
        JDialog dlg;

        frm = new JFrame("JFrame");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrameExample.EXIT_ON_CLOSE);
        frm.setVisible(true);

        dlg = new JDialog(frm, "JDialog", true);
        dlg.setSize(100, 100);
        dlg.setVisible(true);
    }
}
