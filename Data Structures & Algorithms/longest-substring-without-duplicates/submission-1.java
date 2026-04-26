class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }

        if (s.length() == 1){
            return 1;
        }

        char[] chars = s.toCharArray();

        int i = 0;
        int j = 1;
        int maxSize = 1;
        Map<Character, Integer> cache = new HashMap<>();
        cache.put(chars[0], 0);

        // loop
        while (j < s.length()){
            // break condition
            if (cache.containsKey(chars[j])){
                int match = cache.get(chars[j]);
                clearCache(cache, match);
                i = match + 1;
            }
            cache.put(chars[j], j);
            j++;
            if ((j - i) > maxSize){
                maxSize = j - i;
            }
        }

        return maxSize;
    }

    void clearCache (Map<Character, Integer> cache, int index){
        cache.entrySet().removeIf(entry -> entry.getValue() <= index);
    }
}
