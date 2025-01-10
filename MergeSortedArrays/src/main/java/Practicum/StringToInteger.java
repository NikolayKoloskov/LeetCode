package Practicum;

public class StringToInteger {
    public int myAtoi(String s) {
        String result = s.trim();
        StringBuilder sb = new StringBuilder();
        boolean negative = false;
        Integer returnInt = 0;
        int i = 0;
        while (!Character.isDigit(result.charAt(i)) && (i < result.length())) {
            if (result.charAt(i) == ' ') {
                return 0;
            }
            i++;
        }
        if (i > 0) {
            if (result.charAt(i - 1) == '-') {
                negative = true;
            }
        }
        while (i < result.length() && (Character.isDigit(result.charAt(i)))) {
            sb.append(result.charAt(i));
            i++;
        }
        if (negative) {
            returnInt = Integer.parseInt(sb.toString()) * -1;
        } else {
            returnInt = Integer.parseInt(sb.toString());
        }
        return returnInt;
    }

    public static void main(String[] args) {
        StringToInteger sti = new StringToInteger();
        System.out.println(sti.myAtoi("-91283472332"));
    }
}
