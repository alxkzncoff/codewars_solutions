package codewars.solutions;

/**
 * Task:
 * Usually when you buy something, you're asked whether your credit card number,
 * phone number or answer to your most secret question is still correct.
 * However, since someone could look over your shoulder, you don't want that shown on your screen.
 * Instead, we mask it.
 *
 * Your task is to write a function maskify,
 * which changes all but the last four characters into '#'.
 */

public class Mask {
    public static String maskify(String str) {
        return str.length() > 4 ? "#".repeat(str.length() - 4) + str.substring(str.length() - 4) : str;
    }
}
