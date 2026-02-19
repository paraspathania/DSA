package Questions.Step_13_DP;
public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3)
            return 0;
        int dp = 0;
        int sum = 0;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                dp++;
                sum += dp;
            } else {
                dp = 0;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Arithmetic Slices Implemented");
    }
}
