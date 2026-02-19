package Questions.Sliding_Window;
public class MinSwapsGroup1sII {
    public int minSwaps(int[] nums) {
        int ones = 0;
        for (int num : nums)
            ones += num;
        if (ones == 0)
            return 0;
        int n = nums.length;
        int left = 0, currentOnes = 0, maxOnes = 0;
        for (int right = 0; right < 2 * n; right++) {
            if (nums[right % n] == 1)
                currentOnes++;
            if (right - left + 1 > ones) {
                if (nums[left % n] == 1)
                    currentOnes--;
                left++;
            }
            if (right - left + 1 == ones) {
                maxOnes = Math.max(maxOnes, currentOnes);
            }
        }
        return ones - maxOnes;
    }
    public static void main(String[] args) {
        System.out.println("Minimum Swaps to Group All 1s Together II Implemented");
    }
}
