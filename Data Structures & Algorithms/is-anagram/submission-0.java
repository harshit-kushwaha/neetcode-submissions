class Solution {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null){
            return false;
        }
        if (s.length() != t.length()){
            return false;
        }

        Map<Character, Integer> cache1 = new HashMap<>();
        for (char c: s.toCharArray()){
            if (!cache1.containsKey(c)){
                cache1.put(c, 1);
            } else {
                cache1.put(c, cache1.get(c) + 1);
            }
        }

        Map<Character, Integer> cache2 = new HashMap<>();
        for (char c: t.toCharArray()){
            if (!cache2.containsKey(c)){
                cache2.put(c, 1);
            } else {
                cache2.put(c, cache2.get(c) + 1);
            }
        }

        return cache1.equals(cache2);
    }
}
