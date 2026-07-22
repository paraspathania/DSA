class Solution {
    public int maxArea(int[] h) {
        int n = h.length;

        int l = 0; 
        int r = n - 1; 
        int ans = 0;

        while(l < r){
            int w = r - l;
            int m = Math.min(h[r], h[l]);

            int a = w * m;

            ans = Math.max(ans, a);

          if( h[l] < h[r]){
            l++;
          }else{
            r--;
          }
        }
        return ans;
    }
}