package Practicum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

class Fancy {
    private static final int MOD = 1000000007;

    // cache inverse values for 0-100
    private static final int[] INV = IntStream.range(0, 101).map(Fancy::modInverse).toArray();

    // Modular multiplicative inverse x => a * x % MOD == 1
    private static int modInverse(int a) {
        int m = MOD, y = 0, x = 1;
        while (a > 1) {
            int q = a / m;
            int t = m;
            m = a % m;
            a = t;
            t = y;

            y = x - q * y;
            x = t;
        }
        return x < 0 ? x + MOD : x;
    }

    private long mul = 1; // cumulative multiplication (%MOD)
    private long add = 0; // cumulative addition (%MOD)

    private long rmul = 1; // reverse cumulative multiplication (%MOD)

    // store base values, i.e. reverse cumulative transform are applied before addition
    private List<Integer> list = new ArrayList<>();
    Fancy() {
        this.list = new ArrayList<>();
    }
    public void append(int val) {
        list.add((int) (((MOD - add + val) * rmul) % MOD));
    }

    public void addAll(int inc) {
        add = (add + inc) % MOD;
    }

    public void multAll(int m) {
        mul = (mul * m) % MOD;
        rmul = (rmul * INV[m]) % MOD;
        add = (add * m) % MOD;
    }

    public int getIndex(int idx) {
        if (idx < list.size()) {
            return (int) (((list.get(idx) * mul) + add) % MOD);
        } else {
            return -1;
        }
    }


    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, Map<Integer, String>> fullMap = new HashMap<>();

        String[] keys = new String[]{"append", "getIndex", "multAll", "multAll", "getIndex", "addAll", "append", "append",
                "getIndex", "append", "append", "addAll", "getIndex", "multAll", "addAll", "append", "addAll", "getIndex",
                "getIndex", "multAll", "multAll", "multAll", "append", "addAll", "getIndex", "getIndex", "getIndex",
                "append", "getIndex", "addAll", "multAll", "append", "multAll", "addAll", "getIndex", "append", "append",
                "addAll", "getIndex", "multAll", "getIndex", "addAll", "getIndex", "multAll", "addAll", "getIndex",
                "addAll", "append", "append", "append", "multAll", "multAll", "append", "multAll", "addAll", "getIndex",
                "addAll", "multAll", "multAll", "multAll", "append", "multAll", "append", "multAll", "addAll", "append",
                "append", "getIndex", "getIndex", "getIndex", "addAll", "multAll", "multAll", "append", "append",
                "getIndex", "append", "append", "append", "getIndex", "getIndex"};
        Integer[] values = new Integer[]{5, 0, 14, 10, 0, 12, 10, 4, 2, 4, 2, 1, 1, 8, 11, 15, 12, 0, 3, 4, 11, 11,
                10, 8, 2, 3, 0, 7, 3, 2, 6, 10, 6, 8, 7, 9, 9, 12, 0, 13, 7, 3, 4, 8, 14, 2, 9, 9, 9, 7, 5, 12, 9,
                3, 8, 10, 14, 14, 14, 6, 1, 3, 11, 12, 6, 7, 13, 12, 5, 6, 1, 11, 11, 4, 9, 7, 11, 1, 3, 1, 0, 5,
                0, 14, 10, 0, 12, 10, 4, 2, 4, 2, 1, 1, 8, 11, 15, 12, 0, 3, 4, 11, 11, 10, 8, 2, 3, 0, 7, 3, 2,
                6, 10, 6, 8, 7, 9, 9, 12, 0, 13, 7, 3, 4, 8, 14, 2, 9, 9, 9, 7, 5, 12, 9, 3, 8, 10, 14, 14, 14,
                6, 1, 3, 11, 12, 6, 7, 13, 12, 5, 6, 1, 11, 11, 4, 9, 7, 11, 1, 3, 1, 0};

        Fancy fancy = new Fancy();
        for (int i = 0; i < keys.length; i++){

            if (keys[i].equals("append")) {
                fancy.append(values[i]);
            } else if (keys[i].equals("getIndex")) {
                System.out.println(fancy.getIndex(values[i]));
            } else if (keys[i].equals("multAll")) {
                fancy.multAll(values[i]);
            } else if (keys[i].equals("addAll")) {
                fancy.addAll(values[i]);
            }
        }
    }

}
