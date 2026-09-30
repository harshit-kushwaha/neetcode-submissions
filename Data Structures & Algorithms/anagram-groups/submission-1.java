class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> groupedRes = new HashMap<>();

        for (String str: strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);

            if (!groupedRes.containsKey(key)){
                groupedRes.put(key, new ArrayList<>());
            }
            groupedRes.get(key).add(str);
        }

        return new ArrayList<>(groupedRes.values());

    }
}
