package Questions.Step_3_Arrays;
import java.util.Arrays;
public class CountFairPairs {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countLess(nums, upper) - countLess(nums, lower - 1);
    }
    private long countLess(int[] nums, int val) {
        long res = 0;
        for (int i = 0, j = nums.length - 1; i < j; ++i) {
            while (i < j && nums[i] + nums[j] > val) {
                --j;
            }
            res += j - i;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println("Count the Number of Fair Pairs Implemented");
    }
}
