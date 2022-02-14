package leetcode.solutions;

/**
 * Task:
 *
 * You are given two strings word1 and word2.
 * Merge the strings by adding letters in alternating order, starting with word1.
 * If a string is longer than the other,
 * append the additional letters onto the end of the merged string.
 *
 * Return the merged string.
 */

public class MergeStrings {

    public static String solution (String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int difference = word1.length() - word2.length();
        if (difference >= 0) {
            for (int i = 0; i < word2.length(); i++) {
                result.append(word1.charAt(i)).append(word2.charAt(i));
            }
            result.append(word1.substring(word1.length() - difference));
        } else {
            for (int i = 0; i < word1.length(); i++) {
                result.append(word1.charAt(i)).append(word2.charAt(i));
            }
            result.append(word2.substring(word2.length() + difference));
        }
        return result.toString();
    }
}
