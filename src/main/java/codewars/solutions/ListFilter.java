package codewars.solutions;

import java.util.List;

/**
 * In this kata you will create a function that takes a list of non-negative integers
 * and strings and returns a new list with the strings filtered out.
 */
public class ListFilter {

    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(Integer.class::isInstance).toList();
    }
}
