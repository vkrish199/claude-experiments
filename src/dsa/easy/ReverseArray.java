package dsa.easy;

import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] nums) {
        // TODO: implement (reverse nums in place)
        for(int i=0; i<nums.length/2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length-i-1];
            nums[nums.length-i-1] = temp;
        }
    }

    public static void main(String[] args) {
        test(new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1});
        test(new int[]{1, 2}, new int[]{2, 1});
        test(new int[]{7}, new int[]{7});
    }

    private static void test(int[] nums, int[] expected) {
        reverse(nums);
        boolean pass = Arrays.equals(nums, expected);
        System.out.printf("got=%s expected=%s [%s]%n",
                Arrays.toString(nums), Arrays.toString(expected), pass ? "PASS" : "FAIL");
    }
}
