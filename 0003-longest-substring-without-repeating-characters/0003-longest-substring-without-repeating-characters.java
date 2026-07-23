class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character, Integer> map = new HashMap<>();

        int l = 0;
        int maxLen = 0;

        for(int i = 0; i < n; i++){
            char val = s.charAt(i);

            if(map.containsKey(val)){
                l = Math.max(l, map.get(val) + 1);
            }

            map.put(val, i);

            maxLen = Math.max(maxLen, i - l + 1);
        }
          return maxLen;
    }
}