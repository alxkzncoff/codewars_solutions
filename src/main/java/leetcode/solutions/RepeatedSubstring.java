package leetcode.solutions;

/**
 * Task:
 * Given a string s,
 * check if it can be constructed by taking a substring of it
 * and appending multiple copies of the substring together.
 */

public class RepeatedSubstring {
    public boolean solution(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.length() % i == 0) {
                System.out.println(str.substring(0, i));
                if (str.equals(str.substring(0, i).repeat(str.length() / i)))
                    return true;
            }
        }
        return false;
    }
}
