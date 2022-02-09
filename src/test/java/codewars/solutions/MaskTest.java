package codewars.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaskTest {

    @Test
    public void when8Symbols() {
        String expected = "####1234";
        String actual = Mask.maskify("43211234");
        assertEquals(expected, actual);
    }

    @Test
    public void when5Symbols() {
        String expected = "#9876";
        String actual = Mask.maskify("59876");
        assertEquals(expected, actual);
    }

    @Test
    public void when4Symbols() {
        String expected = "Test";
        String actual = Mask.maskify("Test");
        assertEquals(expected, actual);
    }

    @Test
    public void when1Symbol() {
        String expected = "a";
        String actual = Mask.maskify("a");
        assertEquals(expected, actual);
    }

    @Test
    public void when0Symbols() {
        String expected = "";
        String actual = Mask.maskify("");
        assertEquals(expected, actual);
    }

    @Test
    public void when2words() {
        String expected = "########rld!";
        String actual = Mask.maskify("Hello world!");
        assertEquals(expected, actual);
    }

}