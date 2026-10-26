class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0, res = 0;

        for (int i = 0; i < s.length(); i++){
            int dup = s.substring(start, i).indexOf(s.charAt(i));

            // if character is repeated in the window
            if (dup > -1){
                int len = i - start;
                if (len > res) res = len;
                start = start + dup + 1;
            }

        }

        if (start != s.length()){
            if (s.length() - start > res){
                res = s.length() - start;
            }
        }

        return res;
    }
}
