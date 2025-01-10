package Practicum;

public class NumbersOfSubArrays {

    public int numberOfSubarrays(int[] nums, int k) {
        int[] nice = new int[nums.length];
        int first = -1;
        int left = -1;
        int right = 0;
        int midle = 0;
        int sum = 0;
        int totalCount = 0;
        boolean leftBoolean = false;
        boolean firstBoolean = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }
        }
        int i = 0;
        while (i < nice.length && sum < k) {
            if (nums[i] == 1 && !firstBoolean) {
                first = i;
                firstBoolean = true;
            }

            if (!leftBoolean){
                if (nums[i] == 0) {
                    left = i;
                    leftBoolean = true;
                }
                else {
                    left = first;
                    leftBoolean = true;
                }
            }
            sum = sum + nums[i];
            if (sum == k) {
                midle = i;
                right = nextNice(nums, i);
                totalCount = totalCount + ((first - left) + 1 + (right - midle) * (first - left + 1));
                if (right + 1 == nice.length){
                    break;
                }
                i=first + 1;
                midle = 0;
                right = 0;
                sum = 0;
                leftBoolean = false;
                firstBoolean = false;
                continue;
            }
            if (i == nice.length - 1 && sum < k) {
                return 0;
            }
            i++;
        }
        return totalCount;
    }

    private int nextNice(int[] array, int start) {
        if (start + 1 < array.length) {
            start++;
            for (int j = start; j < array.length; j++) {
                if (array[j] == 1) {
                    return j - 1;
                }
            }
        }
        return array.length - 1;
    }

    public int numberOfSubarraysInternet(int[] nums, int k) {
        int n = nums.length;
        int[] cnt = new int[n + 1];
        cnt[0] = 1;
        int ans = 0, t = 0;
        for (int v : nums) {
            t += v & 1;
            if (t - k >= 0) {
                ans += cnt[t - k];
            }
            cnt[t]++;
        }
        return ans;
    }

    public static void main(String[] args) {
        NumbersOfSubArrays num = new NumbersOfSubArrays();
        System.out.println(num.numberOfSubarraysInternet(new int[]{1,1,1,1}, 3));
        System.out.println(7%4);
    }
}
