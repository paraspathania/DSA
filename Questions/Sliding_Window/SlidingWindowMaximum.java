package Questions.Sliding_Window;
import java.util.Deque;
import java.util.LinkedList;
public class SlidingWindowMaximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0)
            return new int[0];
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int ri = 0;
        Deque<Integer> q = new LinkedList<>(); 
        for (int i = 0; i < nums.length; i++) {
            while (!q.isEmpty() && q.peek() < i - k + 1) {
                q.poll();
            }
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }
            q.offer(i);
            if (i >= k - 1) {
                result[ri++] = nums[q.peek()];
            }
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Sliding Window Maximum Implemented");
    }
}
