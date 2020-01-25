package Logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class NCConvertFromAllToDeciTest {

    @Test
    public void strToIntsAr(){
        String number ="43afc";
        int[] expecteds = {4, 3, 10, 15, 12};
        int[] actuals = NCConvertFromAllToDeci.strToIntsAr(number);
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void strToIntsAr1(){
        String number ="ABCDEF";
        int[] expecteds = {10, 11, 12, 13, 14, 15};
        int[] actuals = NCConvertFromAllToDeci.strToIntsAr(number);
        assertArrayEquals(expecteds, actuals);
    }

    @Test (expected = IllegalArgumentException.class)
    public void strToIntsAr2(){
        String number = null;
        NCConvertFromAllToDeci.strToIntsAr(number);
    }

    @Test
    public void strToIntsAr3(){
        String number ="";
        int[] expecteds = {};
        int[] actuals = NCConvertFromAllToDeci.strToIntsAr(number);
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void strToIntsAr4(){
        String number ="a";
        int[] expecteds = {10};
        int[] actuals = NCConvertFromAllToDeci.strToIntsAr(number);
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void strToIntsAr5(){
        String number ="aB";
        int[] expecteds = {10, 11};
        int[] actuals = NCConvertFromAllToDeci.strToIntsAr(number);
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void strToIntsAr6(){
        String number ="B";
        int[] expecteds = {11};
        int[] actuals = NCConvertFromAllToDeci.strToIntsAr(number);
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void testFuncAllToDeci2(){
        int [] number = {1};
        int syst = 2;
        int expected = 1;
        int actual = NCConvertFromAllToDeci.funcAllToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testFuncAllToDeci21(){
        int [] number = {1, 1};
        int syst = 2;
        int expected = 3;
        int actual = NCConvertFromAllToDeci.funcAllToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testFuncAllToDeci22(){
        int [] number = {1, 1, 0, 1};
        int syst = 2;
        int expected = 13;
        int actual = NCConvertFromAllToDeci.funcAllToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testFuncAllToDeci23(){
        int [] number = {1, 1, 1, 1, 0};
        int syst = 2;
        int expected = 30;
        int actual = NCConvertFromAllToDeci.funcAllToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testFuncAllToDeci81(){
        int [] number = {7};
        int syst = 8;
        int expected = 7;
        int actual = NCConvertFromAllToDeci.funcAllToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testFuncAllToDeci82(){
        int [] number = {7, 1};
        int syst = 8;
        int expected = 57;
        int actual = NCConvertFromAllToDeci.funcAllToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testFuncAllToDeci83(){
        int [] number = {3, 5};
        int syst = 8;
        int expected = 29;
        int actual = NCConvertFromAllToDeci.funcAllToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testFuncAllToDeci84(){
        int [] number = {7, 1, 3, 5};
        int syst = 8;
        int expected = 3677;
        int actual = NCConvertFromAllToDeci.funcAllToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testFuncAllToDeci8(){
        int [] number = {5, 4, 3, 2, 1};
        int syst = 8;
        int expected = 22737;
        int actual = NCConvertFromAllToDeci.funcAllToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testFuncAllToDeci16(){
        int [] number = {10};
        int syst = 16;
        int expected = 10;
        int actual = NCConvertFromAllToDeci.funcAllToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testFuncAllToDeci161(){
        int [] number = {15, 1};
        int syst = 16;
        int expected = 241;
        int actual = NCConvertFromAllToDeci.funcAllToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testFuncAllToDeci162(){
        int [] number = {2, 2, 2};
        int syst = 16;
        int expected = 546;
        int actual = NCConvertFromAllToDeci.funcAllToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testFuncAllToDeci163(){
        int [] number = {5, 10, 15, 10};
        int syst = 16;
        int expected = 23290;
        int actual = NCConvertFromAllToDeci.funcAllToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testFuncAllToDeci164(){
        int [] number = {10, 10, 15, 15, 0};
        int syst = 16;
        int expected = 700400;
        int actual = NCConvertFromAllToDeci.funcAllToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testFuncAllToDeci165(){
        int [] number = {10, 11, 12, 13, 14, 15};
        int syst = 16;
        int expected = 11259375;
        int actual = NCConvertFromAllToDeci.funcAllToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testRank(){
        int number = 2;
        int syst = 16;
        int expected = 256;
        int actual = NCConvertFromAllToDeci.rank(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testRank1(){
        int number = 1;
        int syst = 16;
        int expected = 16;
        int actual = NCConvertFromAllToDeci.rank(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testRank2(){
        int number = 3;
        int syst = 16;
        int expected = 4096;
        int actual = NCConvertFromAllToDeci.rank(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testRank3(){
        int number = 1;
        int syst = 10;
        int expected = 10;
        int actual = NCConvertFromAllToDeci.rank(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testRank4(){
        int number = 2;
        int syst = 10;
        int expected = 100;
        int actual = NCConvertFromAllToDeci.rank(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testRank5(){
        int number = 3;
        int syst = 10;
        int expected = 1000;
        int actual = NCConvertFromAllToDeci.rank(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testRank6(){
        int number = 0;
        int syst = 8;
        int expected = 1;
        int actual = NCConvertFromAllToDeci.rank(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testRank7(){
        int number = 1;
        int syst = 8;
        int expected = 8;
        int actual = NCConvertFromAllToDeci.rank(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testRank8(){
        int number = 2;
        int syst = 8;
        int expected = 64;
        int actual = NCConvertFromAllToDeci.rank(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testRank9(){
        int number = 3;
        int syst = 8;
        int expected = 512;
        int actual = NCConvertFromAllToDeci.rank(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testRank10(){
        int number = 2;
        int syst = 2;
        int expected = 4;
        int actual = NCConvertFromAllToDeci.rank(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testRank11(){
        int number = 3;
        int syst = 2;
        int expected = 8;
        int actual = NCConvertFromAllToDeci.rank(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testConverter2(){
        String number = "11";
        int syst = 2;
        int expected = 3;
        int actual = NCConvertFromAllToDeci.convertToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testConverter21(){
        String number = "110011";
        int syst = 2;
        int expected = 51;
        int actual = NCConvertFromAllToDeci.convertToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testConverter22(){
        String number = "10000001";
        int syst = 2;
        int expected = 129;
        int actual = NCConvertFromAllToDeci.convertToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testConverter8(){
        String number = "7";
        int syst = 8;
        int expected = 7;
        int actual = NCConvertFromAllToDeci.convertToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testConverter81(){
        String number = "77";
        int syst = 8;
        int expected = 63;
        int actual = NCConvertFromAllToDeci.convertToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testConverter82(){
        String number = "1234567";
        int syst = 8;
        int expected = 342391;
        int actual = NCConvertFromAllToDeci.convertToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testConverter16(){
        String number = "A";
        int syst = 16;
        int expected = 10;
        int actual = NCConvertFromAllToDeci.convertToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testConverter161(){
        String number = "Acf";
        int syst = 16;
        int expected = 2767;
        int actual = NCConvertFromAllToDeci.convertToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testConverter162(){
        String number = "AbCdEf";
        int syst = 16;
        int expected = 11259375;
        int actual = NCConvertFromAllToDeci.convertToDeci(number, syst);
        assertEquals(expected, actual);
    }

    @Test
    public void testConverter10(){
        String number = "123456";
        int syst = 10;
        int expected = 123456;
        int actual = NCConvertFromAllToDeci.convertToDeci(number, syst);
        assertEquals(expected, actual);
    }
    @Test
    public void testConverter101(){
        String number = "987654321";
        int syst = 10;
        int expected = 987654321;
        int actual = NCConvertFromAllToDeci.convertToDeci(number, syst);
        assertEquals(expected, actual);
    }
    @Test
    public void testConverter102(){
        String number = "121212";
        int syst = 10;
        int expected = 121212;
        int actual = NCConvertFromAllToDeci.convertToDeci(number, syst);
        assertEquals(expected, actual);
    }
}