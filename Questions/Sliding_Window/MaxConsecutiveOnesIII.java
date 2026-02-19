package Questions.Sliding_Window;
public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0)
                k--;
            if (k < 0) {
                if (nums[left] == 0)
                    k++;
                left++;
            }
        }
        return right - left;
    }
    public static void main(String[] args) {
        System.out.println("Max Consecutive Ones III Implemented");
    }
}
