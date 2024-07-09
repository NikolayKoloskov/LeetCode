package Practicum;

public class ReverseIntegerTwo {
    public int reverse(int x) {
        String string = Integer.toString(x);
        String[] split = string.split("");
        StringBuilder sb = new StringBuilder();
        if (split[0].equals("-")) {
            sb.append(split[0]);
            for (int i = string.length() - 1; i >= 1; i--) {
                sb.append(split[i]);
            }
            Long y = Long.parseLong(sb.toString());
            if ((y <= Math.pow(-2, 31)) | (y >= Math.pow(2, 31) - 1)) {
                return 0;
            }
            return y.intValue();
        }
        sb = new StringBuilder(string);
        sb.reverse();
        Long y = Long.parseLong(sb.toString());
        if ((y <= Math.pow(-2, 31)) | (y >= Math.pow(2, 31) - 1)) {
            return 0;
        }
        return y.intValue();
    }

    public static void main(String[] args) {
        ReverseIntegerTwo reverseIntegerTwo = new ReverseIntegerTwo();
        System.out.println(reverseIntegerTwo.reverse(1534236469));
        System.out.println(reverseIntegerTwo.reverse(-123));
    }
}
