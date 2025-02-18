package Algorithm;

public class Test {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            sum[i] = nums[i] + sum[i + 1];
        }
        return sum;
    }
}
