package chap7;

import javax.swing.*;

public class JMenuExample {

    public static void main(String[] args) {
        JFrame frm;
        JMenuBar menuBar;
        JMenu menuFile, menuSave, menuEdit, menuHelp;
        JMenuItem itemNew, itemSaveAs, itemSaveAll, itemExit, itemAbout;
        
        frm = new JFrame("JMenu Example");
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        menuBar = new JMenuBar();
        
        menuFile = new JMenu("File");
        menuSave = new JMenu("Save");
        menuEdit = new JMenu("Edit");
        menuHelp = new JMenu("Help");
        
        itemNew = new JMenuItem("New");
        itemSaveAs = new JMenuItem("Save As...");
        itemSaveAll = new JMenuItem("Save All");
        itemExit = new JMenuItem("Exit", 'E');
        itemAbout = new JMenuItem("About");
        
        menuSave.add(itemSaveAs);
        menuSave.add(itemSaveAll);
        menuFile.add(itemNew);
        menuFile.add(menuSave);
        menuFile.addSeparator();
        menuFile.add(itemExit);
        menuHelp.add(itemAbout);
        
        menuBar.add(menuFile);
        menuBar.add(menuEdit);
        menuBar.add(menuHelp);
        
        frm.setJMenuBar(menuBar);
        frm.setVisible(true);
    }
}
