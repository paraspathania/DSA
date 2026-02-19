package Questions.Backtracking;
public class FairDistributionOfCookies {
    int ans = Integer.MAX_VALUE;
    public int distributeCookies(int[] cookies, int k) {
        backtrack(cookies, k, new int[k], 0);
        return ans;
    }
    private void backtrack(int[] cookies, int k, int[] distribution, int index) {
        if (index == cookies.length) {
            int max = 0;
            for (int val : distribution)
                max = Math.max(max, val);
            ans = Math.min(ans, max);
            return;
        }
        for (int i = 0; i < k; i++) {
            distribution[i] += cookies[index];
            if (distribution[i] < ans) { 
                backtrack(cookies, k, distribution, index + 1);
            }
            distribution[i] -= cookies[index];
            if (distribution[i] == 0)
                break; 
        }
    }
    public static void main(String[] args) {
        System.out.println("Fair Distribution of Cookies Implemented");
    }
}
