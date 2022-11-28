package codewars.solutions;

/**
 * Implement a function that adds two numbers together and returns their sum in binary.
 * The conversion can be done before, or after the addition.
 *
 * The binary number returned should be a string.
 */

public class BinaryAddition {

    public static String binaryAddition(int a, int b){
        return Integer.toBinaryString(a + b);
    }
}
