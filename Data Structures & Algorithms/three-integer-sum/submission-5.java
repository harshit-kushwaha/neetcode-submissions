class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        Set<Integer> visited = new HashSet<>();

        List<List<Integer>> solution = new ArrayList<>();
        // -4, -1, -1, 0, 1, 2

        for (int i = 0; i < nums.length-2; i++){
            int j = i + 1, k = nums.length - 1;
            if (visited.contains(nums[i])){
                continue;
            }

            Set<Integer> visitedIndex = new HashSet<>();
            while (j < k){
                if (nums[j] + nums[k] == -1 * nums[i]){
                    List<Integer> s = new ArrayList<>();
                    s.add(nums[i]);
                    s.add(nums[j]);
                    s.add(nums[k]);
                    solution.add(s);
                    int prevK = k;
                    k--;
                    while (j < k && nums[k] == nums[k+1]){
                        k--;
                    }
                } else if (nums[j] + nums[k] > -1 * nums[i]){
                    k--;
                } else {
                    j++;
                }
            }
            visited.add(nums[i]);
        }

        return solution;
        
    }
}
