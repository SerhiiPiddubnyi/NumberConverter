package Logic;

import javax.swing.*;

public class NCValidate {
    public static boolean validate(String numIn, int sysIn, int sysOut){

        if(sysOut == 0){
            JOptionPane.showMessageDialog(null, "Не выбрана система счисления " +
                    "для итогового значения.");
            return false;
        }

        switch (sysIn){
            case (0):
                JOptionPane.showMessageDialog(null, "Не выбрана система счисления для " +
                        "входящего значения.");
                return false;

            case (2):
                if (!numIn.matches("[0-1]*")) {
                    JOptionPane.showMessageDialog(null, "Неверное значение. " +
                            "Для двоичной ситемы введенное число должно состоять из цифр: 0 и 1.");
                    return false;
                }
                break;
            case (8):
                if (!numIn.matches("[0-7]*")) {
                    JOptionPane.showMessageDialog(null, "Неверное значение. " +
                            "Для восьмеричной ситемы введенное число должно состоять из цифр от 0 до 7.");
                    return false;
                }
                break;
            case (10):
                if (!numIn.matches("\\d*")) {
                    JOptionPane.showMessageDialog(null, "Неверное значение. " +
                            "Для десятеричной ситемы введенное число должно состоять только из цифр.");
                    return false;
                }
                break;
            case (16):
                if (!numIn.matches("[0-9A-Fa-f]*")) {
                    JOptionPane.showMessageDialog(null, "Неверное значение. " +
                            "Для десятеричной ситемы введенное число должно состоять из цифр" +
                            " и\\или букв в диапазоне от A до F.");
                    return false;
                }
                break;
        }
        return true;
    }

}
