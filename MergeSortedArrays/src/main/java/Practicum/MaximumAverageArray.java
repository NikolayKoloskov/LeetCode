package Practicum;

public class MaximumAverageArray {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0, avg, maxavg;
        int i, c = 0;
        for (i = 0; i < k; i++) {
            sum = sum + nums[i];
        }
        avg = sum / k;
        maxavg = avg;
        for (i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[c];
            c++;
            avg = sum / k;
            if (maxavg < avg) {
                maxavg = avg;
            }
        }
        return maxavg;
    }

    //Используется Sliding Window когда сначала суммируем сумму чисел с самого начала до k,
    // потом прибавляем 1 число и вычитаем первое и сравниваем сумму с максимальной суммой.

    public static void main(String[] args) {
        MaximumAverageArray ma = new MaximumAverageArray();
        System.out.println(ma.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
    }
}
