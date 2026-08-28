package dsa.easy;

public class FindMax {

    public static int findMax(int[] nums) {
        // TODO: implement
        int max = nums[0];
        for(int i = 0; i < nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        test(new int[]{3, 7, 2, 9, 4}, 9);
        test(new int[]{-5, -1, -10}, -1);
        test(new int[]{42}, 42);
    }

    private static void test(int[] nums, int expected) {
        int result = findMax(nums);
        boolean pass = result == expected;
        System.out.printf("nums=%s -> got=%d expected=%d [%s]%n",
                java.util.Arrays.toString(nums), result, expected, pass ? "PASS" : "FAIL");
    }
}
