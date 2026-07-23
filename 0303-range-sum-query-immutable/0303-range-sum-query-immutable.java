class NumArray {

    private int [] pre;

    public NumArray(int[] nums) {
        int n = nums.length;
        pre = new int [n + 1];

        for(int i = 0; i < n; i++){
            pre[i + 1] = pre[i] + nums[i];
        }
    }
    
    public int sumRange(int l, int r) {
        return pre[r + 1] - pre [l];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */