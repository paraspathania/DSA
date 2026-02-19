package Questions.Step_3_Arrays;
import java.util.Arrays;
public class FindMaxNumMarkedIndices {
    public int maxNumOfMarkedIndices(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0, j = n / 2;
        int ans = 0;
        while (i < n / 2 && j < n) {
            if (2 * nums[i] <= nums[j]) {
                ans += 2;
                i++;
            }
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Find Maximum Number of Marked Indices Implemented");
    }
}
