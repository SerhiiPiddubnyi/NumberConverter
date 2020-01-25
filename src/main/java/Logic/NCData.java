package Logic;

public class NCData {

    private static NCData  instance = null;
    private int sysIn, sysOut;
    private String numIn, nunOut;

    private NCData(){
        numIn = "0";
        nunOut = "0";
        sysIn = 0;
        sysOut = 0;
    }

    public static NCData getInstance (){
        if (instance == null){
            instance = new NCData();
        }
        return instance;
    }

    public String getNumIn() {
        return numIn;
    }

    public String getNumOut() {
        return nunOut;
    }

    public int getSysIn() {
        return sysIn;
    }

    public int getSysOut() {
        return sysOut;
    }

    public void setNumIn(String numIn) {
        this.numIn = numIn;
    }

    public void setNumOut(String nunOut) {
        this.nunOut = nunOut;
    }

    public void setSysIn(int sysIn) {
        this.sysIn = sysIn;
    }

    public void setSysOut(int sysOut) {
        this.sysOut = sysOut;
    }
}
