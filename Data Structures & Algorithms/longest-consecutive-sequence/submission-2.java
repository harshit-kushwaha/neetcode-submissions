class Solution {
    public int longestConsecutive(int[] nums) {
        // if size is 1
        if (nums.length == 0){
            return 0;
        }
        if (nums.length == 1){
            return 1;
        }

        // sort
        Arrays.sort(nums);

        // loop with counting conse.. and skip if no conse..
        int max = 1;
        int count = 1;

        for (int i = 1; i < nums.length; i++){
            if (nums[i] - nums[i-1] == 1){
                count++;
                if (count > max){
                    max = count;
                }
            } else if (nums[i] == nums[i-1]){
                continue;
            } else {
                count = 1;
            }
        }

        return max;
    }
}
