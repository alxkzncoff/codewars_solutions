package leetcode.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    @Test
    public void whenTarget9() {
        int[] in = new int[]{2, 7, 11, 15};
        int[] expected = new int[]{0, 1};
        int[] actual = new TwoSum().fasterSolution(in, 9);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenTarget15() {
        int[] in = new int[]{21, 0, 7, 1, 8, -3};
        int[] expected = new int[]{2, 4};
        int[] actual = new TwoSum().fasterSolution(in, 15);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void whenTarget6() {
        int[] in = new int[]{3, 2, 4};
        int[] expected = new int[]{1, 2};
        int[] actual = new TwoSum().fasterSolution(in, 6);
        assertArrayEquals(expected, actual);
    }

}