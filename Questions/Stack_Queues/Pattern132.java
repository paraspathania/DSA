package Questions.Step_10_Stack_Queues;
import java.util.Stack;
public class Pattern132 {
    public boolean find132pattern(int[] nums) {
        if (nums.length < 3)
            return false;
        Stack<Integer> stack = new Stack<>();
        int third = Integer.MIN_VALUE;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third)
                return true;
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                third = stack.pop();
            }
            stack.push(nums[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("132 Pattern Implemented");
    }
}
