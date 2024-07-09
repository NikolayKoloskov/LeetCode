package Practicum;

/**
 * #9. Palindrome Number EASY https://leetcode.com/problems/palindrome-number/description/
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        } else if (x == 0) {
            return true;
        } else if (x > 0) {
            int a;
            int n = 0;
            int f = x;
            while (x > 0) {
                a = x%10;
                x = x/10;
                n = n * 10 + a;
            }
            if (f == n){
                return true;
            }
        }
        return false;
    }
}
