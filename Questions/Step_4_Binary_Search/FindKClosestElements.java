package Questions.Step_4_Binary_Search;
import java.util.ArrayList;
import java.util.List;
public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0, right = arr.length - 1;
        while (right - left >= k) {
            if (Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                right--;
            } else {
                left++;
            }
        }
        List<Integer> result = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            result.add(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Find K Closest Elements Implemented");
    }
}
