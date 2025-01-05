package Practicum;

import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[][] res = new int[intervals.length][2];
        int index = 0;
        for (int i = 0; i < intervals.length; i++) {
            if (i == 0 || intervals[i][0] > res[index - 1][1]) {
                res[index++] = intervals[i];
            } else {
                res[index - 1][1] = Math.max(res[index - 1][1], intervals[i][1]);
            }
        }
        return Arrays.copyOf(res, index);
    }
    public static void main (String[]args){
        MergeIntervals mergeIntervals = new MergeIntervals();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] result = mergeIntervals.merge(intervals);
        System.out.println(Arrays.deepToString(result));
    }
}


