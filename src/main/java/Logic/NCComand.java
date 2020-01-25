package Logic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NCComand implements ActionListener {
    private NCData ncData;
    private static NCComand inctance;
    private  JTextField txtIn, txtRes;

    private NCComand(){
        ncData = NCData.getInstance();
        inctance = null;
    }

    public void setTxtFields (JTextField txtIn, JTextField txtRes){
        this.txtIn  = txtIn;
        this.txtRes = txtRes;
    }

    public static NCComand getInctance(){
        if (inctance == null){
            inctance = new NCComand();
        }
        return inctance;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        ncData.setNumIn(txtIn.getText());
        boolean validate = NCValidate.validate(ncData.getNumIn(), ncData.getSysIn(), ncData.getSysOut());
        if (validate) {
            int deci = NCConvertFromAllToDeci.convertToDeci(ncData.getNumIn(), ncData.getSysIn());
            ncData.setNumOut(NCConvertFromDeciToAll.deciToAll(deci, ncData.getSysOut()));
            txtRes.setText(ncData.getNumOut());
        }
    }
}
