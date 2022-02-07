package codewars.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

public class Multiples3or5Test {

    @Test
    public void when10() {
        assertEquals(23, new Multiples3or5().solution(10));
    }

    @Test
    public void when20() {
        assertEquals(78, new Multiples3or5().solution(20));
    }

    @Test
    public void whenNegative() {
        assertEquals(0, new Multiples3or5().solution(-1));
    }

}