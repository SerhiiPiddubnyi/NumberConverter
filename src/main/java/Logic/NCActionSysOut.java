package Logic;

import GUI.NCPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NCActionSysOut implements ActionListener {
    private static NCActionSysOut instance;
    NCData ncData;
    NCPanel ncPanel;

    private NCActionSysOut(){
        instance = null;
        ncData = NCData.getInstance();
    }

    public static NCActionSysOut getInstance(){
        if (instance == null){
            instance = new NCActionSysOut();
        }
        return instance;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int susOut = Integer.parseInt(e.getActionCommand());
        ncData.setSysOut(susOut);
    }
}