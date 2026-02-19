package Questions.Stack_Queues;
import java.util.Arrays;
import java.util.Stack;
public class NextGreaterElementIV {
    public int[] secondGreaterElement(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> temp = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!s2.isEmpty() && nums[s2.peek()] < nums[i]) {
                result[s2.pop()] = nums[i];
            }
            while (!s1.isEmpty() && nums[s1.peek()] < nums[i]) {
                temp.push(s1.pop());
            }
            while (!temp.isEmpty()) {
                s2.push(temp.pop());
            }
            s1.push(i);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Next Greater Element IV Implemented");
    }
}
