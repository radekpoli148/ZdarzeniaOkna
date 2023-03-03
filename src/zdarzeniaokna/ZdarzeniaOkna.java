package zdarzeniaokna;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ZdarzeniaOkna extends JFrame implements WindowListener{

    public ZdarzeniaOkna()
    {
        initComponents();
    }
    public void initComponents()
    {
        this.setTitle("Przeszukiwacz Tekstu");
        this.setBounds(300, 320, 400, 200);
        
        this.addWindowListener(new WindowAdapter() {
        
            public void windowOpened(WindowEvent e) 
            {
                JOptionPane.showMessageDialog(rootPane, "Witaj ;)");
            }
        
        });
        
        this.setDefaultCloseOperation(0);
    }
    public static void main(String[] args) {
        new ZdarzeniaOkna().setVisible(true);
    }

    @Override
    public void windowOpened(WindowEvent e) {
        JOptionPane.showMessageDialog(rootPane, "Witaj ;)");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        int opcja = JOptionPane.showConfirmDialog(rootPane, "Czy na pewno chcesz zamknąć program?");
        
        if(opcja == 0)
            this.dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Zapisujemy dane na dysku");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Jestem minimalizowany");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Jestem maksymalizowany");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println("Jestem aktywny");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Jestem nieaktywny");
    }
    
}
