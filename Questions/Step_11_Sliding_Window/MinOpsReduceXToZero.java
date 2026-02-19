package Questions.Step_11_Sliding_Window;
public class MinOpsReduceXToZero {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for (int num : nums)
            totalSum += num;
        int target = totalSum - x;
        if (target < 0)
            return -1;
        if (target == 0)
            return nums.length;
        int n = nums.length;
        int minOps = Integer.MAX_VALUE;
        int currentSum = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            currentSum += nums[right];
            while (currentSum > target && left <= right) {
                currentSum -= nums[left];
                left++;
            }
            if (currentSum == target) {
                minOps = Math.min(minOps, n - (right - left + 1));
            }
        }
        return minOps == Integer.MAX_VALUE ? -1 : minOps;
    }
    public static void main(String[] args) {
        System.out.println("Minimum Operations to Reduce X to Zero Implemented");
    }
}
