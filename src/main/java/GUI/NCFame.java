package GUI;

import javax.swing.*;

public class NCFame extends JFrame {
    public NCFame(){
        setTitle("Converter");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(200, 100, 410, 300);

        NCPanel pan = new NCPanel();
        add(pan);

        setVisible(true);
    }
}
