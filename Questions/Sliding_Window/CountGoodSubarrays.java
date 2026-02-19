package Questions.Sliding_Window;
import java.util.HashMap;
import java.util.Map;
public class CountGoodSubarrays {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        long count = 0;
        long pairs = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            pairs += map.getOrDefault(nums[right], 0);
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            while (pairs >= k) {
                count += nums.length - right;
                map.put(nums[left], map.get(nums[left]) - 1);
                pairs -= map.get(nums[left]);
                left++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println("Count the Number of Good Subarrays Implemented");
    }
}
