package leetcode.solutions;

import java.util.HashMap;
import java.util.Map;

/**
 * Task:
 * Given an array of integers nums and an integer target,
 * return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution,
 * and you may not use the same element twice.
 *
 * You can return the answer in any order.
 */

public class TwoSum {

    /**
     * O(n^2) solution
     * @param numbers input array.
     * @param target target value.
     * @return array of indices.
     */
    public int[] solution(int[] numbers, int target) {
        int[] result = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * O(n) solution.
     * @param numbers input array.
     * @param target target value.
     * @return array of indices.
     */
    public int[] fasterSolution(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i], i);
        }
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i]) && map.get(target - numbers[i]) != i) {
                result[0] = i;
                result[1] = map.get(target - numbers[i]);
                break;
            }
        }
        return result;
    }

}
