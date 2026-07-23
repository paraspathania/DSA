class Solution {
    public double findMaxAverage(int[] nums, int k) {
        // int l = 0;
        int num = 0;
        for(int i = 0; i < k; i++){
            num += nums[i];
        }
        int maxSum = num;

        for(int i = k; i < nums.length; i++){
            num += nums[i];
            num -= nums[i - k];
            maxSum = Math.max(maxSum, num);
        }

        return (double) maxSum/k;
    }
}