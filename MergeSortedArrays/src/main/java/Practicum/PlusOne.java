package Practicum;

/**
 * #66. Plus One EASY https://leetcode.com/problems/plus-one/
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
    int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }
        return digits;
    }


    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        int[] digits = {8,9,9,9};
        int[] result = plusOne.plusOne(digits);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
        System.out.println();

    }
}
