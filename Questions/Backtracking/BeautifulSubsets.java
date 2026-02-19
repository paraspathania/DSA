package Questions.Backtracking;
import java.util.HashMap;
import java.util.Map;
public class BeautifulSubsets {
    int result = 0;
    public int beautifulSubsets(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        backtrack(nums, k, 0, map);
        return result - 1; 
    }
    private void backtrack(int[] nums, int k, int idx, Map<Integer, Integer> map) {
        if (idx == nums.length) {
            result++;
            return;
        }
        backtrack(nums, k, idx + 1, map);
        if (!map.containsKey(nums[idx] - k) && !map.containsKey(nums[idx] + k)) {
            map.put(nums[idx], map.getOrDefault(nums[idx], 0) + 1);
            backtrack(nums, k, idx + 1, map);
            map.put(nums[idx], map.get(nums[idx]) - 1);
            if (map.get(nums[idx]) == 0)
                map.remove(nums[idx]);
        }
    }
    public static void main(String[] args) {
        System.out.println("The Number of Beautiful Subsets Implemented");
    }
}
