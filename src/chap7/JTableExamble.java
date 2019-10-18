package chap7;

import javax.swing.*;

public class JTableExamble extends JFrame {
    
    public static void main(String[] args) {
        JFrame frm;
        JTable tblData;
        JScrollPane scp;
        
        frm = new JFrame("JMenu Example");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Object rowData[][] = {
            {"5001", "Yada Jaidee", "yada@gmail.com"},
            {"5002", "Manee Siri", "manees@gmail.com"},
            {"5003", "Piti Metta", "pitim@gmail.com"},
            {"5004", "Peera Sukjai", "peeras@gmail.com"}
        };
        String columnNames[] = {"ID", "Name", "Email"};
        tblData = new JTable(rowData, columnNames);
        scp = new JScrollPane(tblData);
        
        frm.add(scp);
        frm.setVisible(true);
    }
}
