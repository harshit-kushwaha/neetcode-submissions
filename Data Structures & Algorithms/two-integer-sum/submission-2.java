class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int t = target - nums[i];
            if (cache.containsKey(nums[i])){
                return new int[]{cache.get(nums[i]), i};
            }
            cache.put(t, i);
        }

        // never exectuted
        return new int[]{0,0};
    }
}
