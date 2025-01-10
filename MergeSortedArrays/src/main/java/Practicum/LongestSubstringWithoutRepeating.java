package Practicum;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
        public int myAtoi(String s) {
            String result = s.trim();
            StringBuilder sb = new StringBuilder();
            boolean negative = false;
            boolean moreThanMax = false;
            long returnInt = 0;
            int i = 0;
            while (i < result.length()) {
                if (!Character.isDigit(result.charAt(i))) {
                    if (result.charAt(i) == ' ') {
                        return 0;
                    }
                    i++;
                    continue;
                }
                if (Character.isDigit(result.charAt(i))) {
                    if (i > 1) {
                        return 0;
                    }
                    if (i > 0) {
                        if (result.charAt(i - 1) == '-') {
                            negative = true;
                        }
                        else if (result.charAt(i-1) == '+') {
                            negative = false;
                        }
                        else {
                            return 0;
                        }
                    }
                    break;
                }
                break;
            }
            while (i < result.length()) {
                if (Character.isDigit(result.charAt(i))) {
                    sb.append(result.charAt(i));
                    i++;
                }else {
                    break;
                }
            }
            if (sb.length() > 10){
                int j = 0;
                int stringLength = sb.length();
                for (int k = 0; k < sb.length(); k++){
                    while (sb.charAt(j) == '0') {
                        sb.deleteCharAt(j);
                        k++;
                        if (k == stringLength) {
                            break;
                        }
                    }
                        break;
                }
            }
            if (sb.length() > 10){
                moreThanMax = true;
                sb = new StringBuilder();
                sb.append(Integer.MAX_VALUE);
            }
            if (sb.length() == 0) {
                return 0;
            }
            if (negative) {
                if (moreThanMax) {
                    return Integer.MIN_VALUE;
                }
                long midleResult = Long.parseLong(sb.toString()) * -1;
                if (midleResult < Integer.MIN_VALUE) {
                    return Integer.MIN_VALUE;
                }
                returnInt = Long.parseLong(sb.toString()) * -1;

            } else {
                if (moreThanMax) {
                    return Integer.MAX_VALUE;
                }
                long midleResult = Long.parseLong(sb.toString());
                if (midleResult > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                returnInt = Long.parseLong(sb.toString());
            }
            return (int) returnInt;
        }


    public static void main(String[] args) {
        LongestSubstringWithoutRepeating longestSubstringWithoutRepeating = new LongestSubstringWithoutRepeating();
        System.out.println(longestSubstringWithoutRepeating.myAtoi("-2147483649"));
    }
}




