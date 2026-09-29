class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            cache.put(target - nums[i], i);
        }

        for (int i = 0; i < nums.length; i++){
            Integer j = cache.get(nums[i]);
            if (j != null && i != j){
                return new int[]{i, j};
            }
        }

        // never exectuted
        return new int[]{0,0};
    }
}
