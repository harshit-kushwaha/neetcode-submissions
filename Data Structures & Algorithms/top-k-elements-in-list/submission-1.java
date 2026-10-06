class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> counter = new HashMap<>();
            List<Integer> res = new ArrayList<>();

            for (int n: nums){
                counter.put(n, counter.getOrDefault(n, 0)+1);
            }

            return counter.entrySet().stream()
                    .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                    .limit(k)
                    .toList()
                    .stream()
                    .map(Map.Entry::getKey)
                    .mapToInt(Integer::intValue)
                    .toArray();
    }


}
