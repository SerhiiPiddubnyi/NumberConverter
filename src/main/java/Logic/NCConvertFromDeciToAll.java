package Logic;

public class NCConvertFromDeciToAll {

    public static String deciToAll (int numberDeсi, int systOut)  {
        int temp = numberDeсi;
        int leng = 0;

        for (int i = 1; temp > 0; i++) {
            temp /= systOut;
            leng = i;
        }

        int[] deciToAll = new int[leng];

        for (int i = leng - 1; i >= 0; i--) {
            deciToAll[i] = numberDeсi % systOut;
            numberDeсi /= systOut;
        }

        String resault = intToStr(deciToAll);

        return resault;
    }

    //функция преобразования масива чисел со значениями 0-15 в строку символов
    public static String intToStr (int[] deciToAll) {
        String finNumber = "";

        if(deciToAll == null){
            throw new IllegalArgumentException();
        }

        int[] numberArrControl = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        char[] charArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        int leng = deciToAll.length;

        char[] finNum = new char[leng];

        for (int i = 0; i < leng; i++) {
            for (int j = 0; j < numberArrControl.length; j++) {
                if (deciToAll[i] == numberArrControl[j]) {
                    finNum[i] = charArr[j];
                }
            }
        }

        for (int i = 0; i < leng; i++){
            finNumber += finNum[i];
        }

        return finNumber;
    }
}
