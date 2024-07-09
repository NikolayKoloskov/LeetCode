package Practicum;

/**
 * 125. Valid Palindrome  EASY https://leetcode.com/problems/valid-palindrome/description
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String regex = "[^a-zA-Z0-9]";
        String str = s.trim().replaceAll(regex, "").toLowerCase();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (sb.toString().equals(sb.reverse().toString())) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(validPalindrome.isPalindrome("race a car"));
        System.out.println(validPalindrome.isPalindrome(" "));
        System.out.println(validPalindrome.isPalindrome("0P"));
        System.out.println(validPalindrome.isPalindrome("a."));
    }
}
