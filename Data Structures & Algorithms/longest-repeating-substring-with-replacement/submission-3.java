class Solution {
    public int characterReplacement(String s, int k) {
        int res = 1;

        int left = 0, right = 0;

        Map<Character, Integer> counter = new HashMap<>();
        counter.put(s.charAt(0), 1);

        while (right < s.length()){ // re-evaluate
            Map.Entry<Character, Integer> entry = getMaxFreq(counter);
            Character c = entry.getKey();
            Integer countOfC = entry.getValue();
            Integer subLength = right - left + 1;
            int target = subLength - countOfC;
            if (target <= k){
                if (subLength > res) res = subLength;
                right++;
                if(right < s.length())
                    counter.put(s.charAt(right), counter.getOrDefault(s.charAt(right), 0) + 1);
            } else {
                counter.put(s.charAt(left), counter.get(s.charAt(left)) - 1);
                left++;
            }
        }

        return res;
    }

    private static Map.Entry<Character, Integer> getMaxFreq (Map<Character, Integer> counter){
        return counter.entrySet()
            .stream()
            .max(Map.Entry.comparingByValue())
            .map(entry -> entry)
            .orElse(null);  
    }
}
