package GUI;

import Logic.NCActionSysIn;
import Logic.NCActionSysOut;
import Logic.NCComand;

import javax.swing.*;
import java.awt.*;

public class NCPanel extends JPanel {

    public NCPanel(){
       NCComand ncComand = NCComand.getInctance();
       NCActionSysIn actionSysIn = NCActionSysIn.getInstance();
       NCActionSysOut actionSysOut = NCActionSysOut.getInstance();

       setLayout(null);
       setBackground(Color.LIGHT_GRAY);

       JLabel labeTxtIn, labelTxtOut, labelChoiceIn, labelChoiceOut;
       JTextField txtIn, txtOut;
       JButton  btnConv;
       JRadioButton btnIn2, btnIn8, btnIn10, btnIn16, btnOut2, btnOut8, btnOut10, btnOut16;
       ButtonGroup radioGroupIn, radioGroupOut;

       labeTxtIn = new JLabel("Set number:");
       labelTxtOut = new JLabel("Result:");
       labelChoiceIn = new JLabel("From:");
       labelChoiceOut = new JLabel("To:");

       txtIn = new JTextField();
       txtOut = new JTextField();

       btnConv = new JButton("Convert");
       btnIn2 = new JRadioButton("2");
       btnIn8 = new JRadioButton("8");
       btnIn10 = new JRadioButton("10");
       btnIn16 = new JRadioButton("16");
       btnOut2 = new JRadioButton("2");
       btnOut8 = new JRadioButton("8");
       btnOut10 = new JRadioButton("10");
       btnOut16 = new JRadioButton("16");

       radioGroupIn = new ButtonGroup();
       radioGroupIn.add(btnIn2);
       radioGroupIn.add(btnIn8);
       radioGroupIn.add(btnIn10);
       radioGroupIn.add(btnIn16);

       radioGroupOut = new ButtonGroup();
       radioGroupOut.add(btnOut2);
       radioGroupOut.add(btnOut8);
       radioGroupOut.add(btnOut10);
       radioGroupOut.add(btnOut16);

       labeTxtIn.setBounds(15, 3, 150, 10);
       labelTxtOut.setBounds(15,53, 150,10);
       labelChoiceIn.setBounds(180, 3, 50, 10);
       labelChoiceOut.setBounds(180,53, 50,10);

       txtIn.setBounds(15, 15, 150, 30);
       txtIn.setHorizontalAlignment(JTextField.RIGHT);

       txtOut.setBounds(15, 65,150,30);
       txtOut.setHorizontalAlignment(JTextField.RIGHT);
       txtOut.setEditable(false);
       txtOut.setBackground(Color.WHITE);

       btnConv.setBounds(15,115,365,30);
       btnIn2.setBounds(180,15, 50,30);
       btnIn8.setBounds(230,15, 50,30);
       btnIn10.setBounds(280,15, 50,30);
       btnIn16.setBounds(330,15, 50,30);
       btnOut2.setBounds(180,65, 50,30);
       btnOut8.setBounds(230,65, 50,30);
       btnOut10.setBounds(280,65, 50,30);
       btnOut16.setBounds(330,65, 50,30);

       btnConv.addActionListener(ncComand);
       btnIn2.addActionListener(actionSysIn);
       btnIn8.addActionListener(actionSysIn);
       btnIn10.addActionListener(actionSysIn);
       btnIn16.addActionListener(actionSysIn);
       btnOut2.addActionListener(actionSysOut);
       btnOut8.addActionListener(actionSysOut);
       btnOut10.addActionListener(actionSysOut);
       btnOut16.addActionListener(actionSysOut);

       btnConv.setActionCommand("Conv");
       btnIn2.setActionCommand("2");
       btnIn8.setActionCommand("8");
       btnIn10.setActionCommand("10");
       btnIn16.setActionCommand("16");
       btnOut2.setActionCommand("2");
       btnOut8.setActionCommand("8");
       btnOut10.setActionCommand("10");
       btnOut16.setActionCommand("16");

       add(labeTxtIn);
       add(labelTxtOut);
       add(labelChoiceIn);
       add(labelChoiceOut);
       add(txtIn);
       add(txtOut);
       add(btnConv);
       add(btnIn2);
       add(btnIn8);
       add(btnIn10);
       add(btnIn16);
       add(btnOut2);
       add(btnOut8);
       add(btnOut10);
       add(btnOut16);

       ncComand.setTxtFields(txtIn, txtOut);
    }
}
