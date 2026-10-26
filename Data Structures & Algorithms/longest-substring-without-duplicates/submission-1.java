class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0, res = 0;
        Set<Character> cache = new HashSet<>();

        for (int i = 0; i < s.length(); i++){

            // if duplicate char
            if (cache.contains(s.charAt(i))){
                // calculate length
                if (cache.size() > res) res = cache.size();

                // while - we dont reach duplicate char from left - left++
                while (s.charAt(left) != s.charAt(i)) cache.remove(s.charAt(left++));
                left++;
                
            } 
            
            cache.add(s.charAt(i));

        }

        return Math.max(res, s.length() - left);
    }
}
