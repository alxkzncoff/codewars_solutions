package leetcode.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatedSubstringTest {

    @Test
    public void whenRepeatTwice() {
        String in = "abab";
        assertTrue(new RepeatedSubstring().solution(in));
    }

    @Test
    public void whenRepeatTriple() {
        String in = "ababab";
        assertTrue(new RepeatedSubstring().solution(in));
    }

    @Test
    public void whenRepeatDoubleA() {
        String in = "aa";
        assertTrue(new RepeatedSubstring().solution(in));
    }

    @Test
    public void whenRepeatForth() {
        String in = "abcabcabcabc";
        assertTrue(new RepeatedSubstring().solution(in));
    }

    @Test
    public void whenRepeatThird() {
        String in = "431431431";
        assertTrue(new RepeatedSubstring().solution(in));
    }

    @Test
    public void whenRepeatTripleB() {
        String in = "bbb";
        assertTrue(new RepeatedSubstring().solution(in));
    }

    @Test
    public void whenRepeatLong() {
        String in = "abaababaab";
        assertTrue(new RepeatedSubstring().solution(in));
    }

    @Test
    public void whenFalse() {
        String in = "edf";
        assertFalse(new RepeatedSubstring().solution(in));
    }
}