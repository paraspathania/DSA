class Solution {
    public String smallestPalindrome(String s) {
        int[] feq = new int[26];
        StringBuilder left = new StringBuilder();
        String mid = "";

        for(char ch: s.toCharArray()){
            feq[ch-'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(feq[i]%2 == 1){
                mid = String.valueOf((char)('a' + i));
            }

            for(int j = 0; j < feq[i] / 2; j++){
                left.append((char)('a' + i));
            }
        }
        String res = left.toString()+ mid + left.reverse().toString();

        return res;
    }
}