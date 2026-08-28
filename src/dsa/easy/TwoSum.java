package dsa.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (seen.containsKey(complement)) {
                return new int[]{seen.get(complement), i};
            }
            seen.put(nums[i], i);
        }
        return new int[2];
    }

    public static void main(String[] args) {
        test(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1});
        test(new int[]{3, 2, 4}, 6, new int[]{1, 2});
        test(new int[]{3, 3}, 6, new int[]{0, 1});
    }

    private static void test(int[] nums, int target, int[] expected) {
        int[] result = twoSum(nums, target);
        boolean pass = Arrays.equals(result, expected);
        System.out.printf("nums=%s target=%d -> got=%s expected=%s [%s]%n",
                Arrays.toString(nums), target, Arrays.toString(result),
                Arrays.toString(expected), pass ? "PASS" : "FAIL");
    }
}
