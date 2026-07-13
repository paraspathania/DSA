class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        int l = 0;
        int r = n - 1;

        while(l < r){
        swap(s, l, r);

        l++;
        r--;
        }

    }
    void swap(char[] s, int l, int r){
        char temp = s[l];
        s[l] = s[r];
        s[r] = temp;
    }
}