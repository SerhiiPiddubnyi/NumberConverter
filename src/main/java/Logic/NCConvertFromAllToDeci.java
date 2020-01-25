package Logic;

public class NCConvertFromAllToDeci {
    public static int convertToDeci(String number, int systIn) {
        int[] number2 = strToIntsAr(number);

        int numberDeci = funcAllToDeci(number2, systIn);

        return numberDeci;
    }

    //функция преобразования строки символов в масив чисел со значениями 0-15
    public static int[] strToIntsAr(String number)
    {
        if(number == null) {
            throw new IllegalArgumentException();
        }

        number = number.toLowerCase();

        char[] arrChar = number.toCharArray();

        char[] arrControl = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        int[] numberArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        int leng = arrChar.length;

        int [] arrNums= new int[leng];

        for (int i = 0; i < leng; i++) {
            for (int j = 0; j < arrControl.length; j++) {
                if (arrChar[i] == arrControl[j]) {
                    arrNums[i] = numberArr[j];
                }
            }
        }
        return arrNums;
    }

    // непосредственно перевод из любой системы в 10
   public static int funcAllToDeci (int[] number2, int systIn)  {

        int numDeci = 0;

        int temp = 0;

        int leng = number2.length;

        for (int i = 0; i < leng; i++) {
            temp = number2[leng - 1 - i];
            temp = temp * rank(i, systIn);
            numDeci +=  temp;
        }
        return (numDeci);
    }

    // степень разряда
    public static int rank (int a, int systIn){

        int rank = 1;

        for (int i = 0; i < a; i++)
        {
            rank *= systIn;
        }

        return rank;
    }
}
