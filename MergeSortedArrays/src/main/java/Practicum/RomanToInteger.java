package Practicum;

/**
 * #13. Roman to Integer EASY https://leetcode.com/problems/roman-to-integer/description/
 */
public class RomanToInteger {
    public int romanToInt(String s) {
        int a = 0;
        int r = 0;
        boolean flag = false;
        for (int i =0; i < s.length(); i++){
            if ((i + 1) < s.length()){
                if ((s.charAt(i) == 'I') && (s.charAt(i+1) == 'V') && ((i + 1) != s.length())) {
                    a = 4;
                    i++;
                    flag = true;
                } else if ((s.charAt(i) == 'I') && (s.charAt(i+1) == 'X') && ((i + 1) != s.length())){
                    a = 9;
                    i++;
                    flag = true;
                } else if ((s.charAt(i) == 'X') && (s.charAt(i+1) == 'C') && ((i + 1) != s.length())) {
                    a = 90;
                    i++;
                    flag = true;
                } else if ((s.charAt(i) == 'X') && (s.charAt(i+1) == 'L') && ((i + 1) != s.length())) {
                    a = 40;
                    i++;
                    flag = true;
                }  else if ((s.charAt(i) == 'C') && (s.charAt(i+1) == 'D') && ((i + 1) != s.length())) {
                    a = 400;
                    i++;
                    flag = true;
                } else if ((s.charAt(i) == 'C') && (s.charAt(i+1) == 'M') && ((i + 1) != s.length())) {
                    a = 900;
                    i++;
                    flag = true;
                }
            }if (!flag) {
                if ((s.charAt(i) == 'I')) {
                    a = 1;
                } else if ((s.charAt(i) == 'X')) {
                    a = 10;
                } else if ((s.charAt(i) == 'C')) {
                    a = 100;
                } else if ((s.charAt(i) == 'D')) {
                    a = 500;
                } else if ((s.charAt(i) == 'M')) {
                    a = 1000;
                } else if ((s.charAt(i) == 'L')) {
                    a = 50;
                } else if ((s.charAt(i) == 'V')) {
                    a = 5;
                }
            }
            flag = false;
            r += a;
        }

        return r;
    }
}
