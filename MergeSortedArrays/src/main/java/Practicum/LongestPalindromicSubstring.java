package Practicum;

public class LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int right;
        int left;
        int max = 0;
        int count = 0;
        int leftSideOfMax = 0;
        int rightSideOfMax = 0;

        while (i < s.length()) {
            right = i + 1;
            left = i;
            while (left >= 0 && right < s.length()) {
                if (s.charAt(left) == s.charAt(right)){
                    count += 2;
                    if (count > max) {
                        max = count;
                        leftSideOfMax = left;
                        rightSideOfMax = right;
                    }
                    right++;
                    left--;
                    continue;
                }
                break;
            }
            count = 0;
            i++;
        }
        i=0;
        while (i < s.length()) {
            right = i + 1;
            left = i-1;
            count = 1;
            while (left >=0 && right < s.length()) {
                if(s.charAt(left) == s.charAt(right)){
                    count +=2;
                    if (count > max) {
                        max = count;
                        leftSideOfMax = left;
                        rightSideOfMax = right;
                    }
                    right++;
                    left--;
                    continue;
                }
               break;
            }
            i++;
        }
        if (max > 0) {
            for (int k = leftSideOfMax; k <= rightSideOfMax; k++){
                sb.append(s.charAt(k));
            }
        }
        if (s.length() >= 1 && max == 0){
            sb.append(s.charAt(0));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LongestPalindromicSubstring test = new LongestPalindromicSubstring();
        System.out.println(test.longestPalindrome("aacabdkacaa"));
    }
}
