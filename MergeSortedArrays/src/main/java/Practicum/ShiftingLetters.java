package Practicum;

public class ShiftingLetters {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb = new StringBuilder();
        long shift = 0;
        for (int i = shifts.length-1; i > -1; i--) {
            shift += shifts[i];
            long index = (s.charAt(i) - 'a' + shift) % 26;
            sb.append((char) ('a' + index));
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        ShiftingLetters shiftingLetters = new ShiftingLetters();
        String s = "mkgfzkkuxownxvfvxasy";
        int[] shifts = {505870226,437526072,266740649,224336793,532917782,311122363,567754492,595798950,81520022,684110326,137742843,275267355,856903962,148291585,919054234,467541837,622939912,116899933,983296461,536563513};
        System.out.println(shiftingLetters.shiftingLetters(s, shifts));
    }
}
