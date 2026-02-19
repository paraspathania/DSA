package Questions.Step_10_Stack_Queues;
import java.util.Stack;
public class MaximalRectangle {
    public int maximalRectangle(char[][] matrix) {
        if (matrix.length == 0)
            return 0;
        int n = matrix[0].length;
        int[] heights = new int[n];
        int maxArea = 0;
        for (char[] row : matrix) {
            for (int i = 0; i < n; i++) {
                heights[i] = (row[i] == '1') ? heights[i] + 1 : 0;
            }
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }
        return maxArea;
    }
    private int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        for (int i = 0; i <= n; i++) {
            int h = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && h < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        System.out.println("Maximal Rectangle Implemented");
    }
}
