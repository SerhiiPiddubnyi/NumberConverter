package Logic;

import GUI.NCPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NCActionSysIn implements ActionListener {
    private static NCActionSysIn instance;
    NCData ncData;
    NCPanel ncPanel;

    private NCActionSysIn(){
        instance = null;
        ncData = NCData.getInstance();
    }

    public static NCActionSysIn getInstance(){
        if (instance == null){
            instance = new NCActionSysIn();
        }
        return instance;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int susIn = Integer.parseInt(e.getActionCommand());
        ncData.setSysIn(susIn);
    }
}
