package leetcode.solutions;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeStringsTest {

    @Test
    public void whenSameLength() {
        String word1 = "abc";
        String word2 = "pqr";
        String expected = "apbqcr";
        String actual = MergeStrings.solution(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    public void whenDifferentLength() {
        String word1 = "ab";
        String word2 = "pqrs";
        String expected = "apbqrs";
        String actual = MergeStrings.solution(word1, word2);
        assertEquals(expected, actual);
    }

    @Test
    public void whenDifferentLength2() {
        String word1 = "abcd";
        String word2 = "pq";
        String expected = "apbqcd";
        String actual = MergeStrings.solution(word1, word2);
        assertEquals(expected, actual);
    }

}