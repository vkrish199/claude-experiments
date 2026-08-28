package dsa.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        // TODO: implement
        Set<Integer> seen = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            if(seen.contains(nums[i])) return true;
            seen.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        test(new int[]{1, 2, 3, 1}, true);
        test(new int[]{1, 2, 3, 4}, false);
        test(new int[]{1, 1, 1, 1}, true);
        test(new int[]{7}, false);
    }

    private static void test(int[] nums, boolean expected) {
        boolean result = containsDuplicate(nums);
        boolean pass = result == expected;
        System.out.printf("nums=%s -> got=%b expected=%b [%s]%n",
                java.util.Arrays.toString(nums), result, expected, pass ? "PASS" : "FAIL");
    }
}
