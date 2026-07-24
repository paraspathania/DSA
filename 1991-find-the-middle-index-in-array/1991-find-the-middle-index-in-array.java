class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;

        int l = 0;
        int total = 0;

        for(int i = 0; i < n; i++){            // O(n);
            total += nums[i];  
        }

        for(int i = 0; i < n; i++){
            int r = total - l - nums[i];

            if(l == r){
                return i;
            }

            l += nums[i];
        }
        return -1;
    }
}