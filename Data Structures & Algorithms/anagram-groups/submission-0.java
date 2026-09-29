class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // get char map of each string. 
        Map<Map<Character, Integer>, List<String>> result = new HashMap<>();

        for (String str: strs){
            Map<Character, Integer> charMap = getCharMap(str);
            result.putIfAbsent(charMap, new ArrayList<>());
            result.get(charMap).add(str);
        }
        
        return new ArrayList<>(result.values());
    }

    private Map<Character, Integer> getCharMap (String str){
        Map<Character, Integer> res = new HashMap<>();
        char[] chars = str.toCharArray();
        for (char c: chars){
            res.put(c, res.getOrDefault(c, 0)+1);
        }
        return res;
    }
}
