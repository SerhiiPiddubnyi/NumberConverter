package Logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class NCConvertFromDeciToAllTest {

    @Test
    public void testDeciToAll16(){
        int numberDeсi = 15;
        int systOut = 16;
        String expected = "f";
        String actual = NCConvertFromDeciToAll.deciToAll(numberDeсi, systOut);
        assertEquals(expected, actual);
    }

    @Test
    public void testDeciToAll161(){
        int numberDeсi = 255;
        int systOut = 16;
        String expected = "ff";
        String actual = NCConvertFromDeciToAll.deciToAll(numberDeсi, systOut);
        assertEquals(expected, actual);
    }

    @Test
    public void testDeciToAll162(){
        int numberDeсi = 1525;
        int systOut = 16;
        String expected = "5f5";
        String actual = NCConvertFromDeciToAll.deciToAll(numberDeсi, systOut);
        assertEquals(expected, actual);
    }

    @Test
    public void testDeciToAll163(){
        int numberDeсi = 1234567;
        int systOut = 16;
        String expected = "12d687";
        String actual = NCConvertFromDeciToAll.deciToAll(numberDeсi, systOut);
        assertEquals(expected, actual);
    }


    @Test
    public void testDeciToAll8(){
        int numberDeсi = 5;
        int systOut = 8;
        String expected = "5";
        String actual = NCConvertFromDeciToAll.deciToAll(numberDeсi, systOut);
        assertEquals(expected, actual);
    }

    @Test
    public void testDeciToAll81(){
        int numberDeсi = 1525;
        int systOut = 8;
        String expected = "2765";
        String actual = NCConvertFromDeciToAll.deciToAll(numberDeсi, systOut);
        assertEquals(expected, actual);
    }

    @Test
    public void testDeciToAll82(){
        int numberDeсi = 1234567;
        int systOut = 8;
        String expected = "4553207";
        String actual = NCConvertFromDeciToAll.deciToAll(numberDeсi, systOut);
        assertEquals(expected, actual);
    }

    @Test
    public void testDeciToAll83(){
        int numberDeсi = 32767;
        int systOut = 8;
        String expected = "77777";
        String actual = NCConvertFromDeciToAll.deciToAll(numberDeсi, systOut);
        assertEquals(expected, actual);
    }

    @Test
    public void testDeciToAll2(){
        int numberDeсi = 2;
        int systOut = 2;
        String expected = "10";
        String actual = NCConvertFromDeciToAll.deciToAll(numberDeсi, systOut);
        assertEquals(expected, actual);
    }
    @Test
    public void testDeciToAll21(){
        int numberDeсi = 18;
        int systOut = 2;
        String expected = "10010";
        String actual = NCConvertFromDeciToAll.deciToAll(numberDeсi, systOut);
        assertEquals(expected, actual);
    }
    @Test
    public void testDeciToAll22(){
        int numberDeсi = 12345;
        int systOut = 2;
        String expected = "11000000111001";
        String actual = NCConvertFromDeciToAll.deciToAll(numberDeсi, systOut);
        assertEquals(expected, actual);
    }
    @Test
    public void testDeciToAll23(){
        int numberDeсi = 255;
        int systOut = 2;
        String expected = "11111111";
        String actual = NCConvertFromDeciToAll.deciToAll(numberDeсi, systOut);
        assertEquals(expected, actual);
    }


    @Test
    public void testIntToStr2(){
        int [] deciToAll = {1, 0, 0, 1, 0};
        String expected = "10010";
        String actual = NCConvertFromDeciToAll.intToStr(deciToAll);
        assertEquals(expected, actual);
    }

    @Test
    public void testIntToStr8(){
        int [] deciToAll = {7, 0, 3};
        String expected = "703";
        String actual = NCConvertFromDeciToAll.intToStr(deciToAll);
        assertEquals(expected, actual);
    }

    @Test
    public void testIntToStr16() {
        int [] deciToAll = {10, 11, 12, 13, 14, 15};
        String expected = "abcdef";
        String actual = NCConvertFromDeciToAll.intToStr(deciToAll);
        assertEquals(expected, actual);
    }
}