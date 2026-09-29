class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums == null || nums.length == 0){
            return false;
        }
        Set<Integer> cache = new HashSet<>();
        for (int n: nums){
            if (cache.contains(n)){
                return true;
            }
            cache.add(n);
        }
        return false;
    }
}