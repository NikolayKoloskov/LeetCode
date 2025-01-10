package Practicum;

import java.util.Arrays;

public class NextPermutation {

    public void nextPermutation(int[] nums) {
        int[] result;
        boolean max = false;
        boolean current = true;
        boolean wasBigger = false;
        int leftToChange = -1;
        int rightToChange = -1;
        int i = 0;
        while (i < nums.length && i + 1 != nums.length){
            if (nums[i] >= nums[i + 1]){
                wasBigger = true;
                current = true;
                leftToChange = i;
                rightToChange = i + 1;
            }
            if (nums[i] < nums[i+1]){
                current = false;
            }
            i++;
        }
        if (!wasBigger && current){
            max = false;
        }
        if (wasBigger && current){
            max = true;
        }
        if (max){
            int[] change = new int[nums.length];
            for (int k = 0; k < nums.length; k++){
                change[nums.length -1 -k] = nums[k];
            }
           nums = change;
        }
        if (current && !max){
            int leftnumber = nums[leftToChange];
            int rightnumber = nums[rightToChange];
            nums[leftToChange] = rightnumber;
            nums[rightToChange] =leftnumber;
        }
        if (!current){
            leftToChange = nums.length-2;
            rightToChange = nums.length-1;
            int leftnumber = nums[leftToChange];
            int rightnumber = nums[rightToChange];
            nums[rightToChange] = leftnumber;
            nums[leftToChange] = rightnumber;
        }

    }

    public static void main(String[] args) {
        NextPermutation n = new NextPermutation();
        n.nextPermutation(new int[]{3,2,1});
    }
}
