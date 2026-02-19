package Questions.Backtracking;
public class TargetSum {
    int count = 0;
    public int findTargetSumWays(int[] nums, int target) {
        backtrack(nums, target, 0, 0);
        return count;
    }
    private void backtrack(int[] nums, int target, int idx, int sum) {
        if (idx == nums.length) {
            if (sum == target)
                count++;
            return;
        }
        backtrack(nums, target, idx + 1, sum + nums[idx]);
        backtrack(nums, target, idx + 1, sum - nums[idx]);
    }
    public static void main(String[] args) {
        System.out.println("Target Sum Implemented");
    }
}
