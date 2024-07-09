package Practicum;

/**
 * #69. Sqrt(x) EASY https://leetcode.com/problems/sqrtx/description/
 */
public class SqrtX {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        if (x == 1) return 1;
        double x0 = x / 2;
        double x1;
        int count = 0;
        while (count<20) {
            x1 = (x0 + x / x0) / 2;
            x0 = x1;
            count++;
            if ((int)x0 * (int)x0 == x){
                return (int)x0;
            }
        }
        return (int)x0;
    }

    public static void main(String[] args) {
        SqrtX s = new SqrtX();
        System.out.println(s.mySqrt(32));
    }
}



