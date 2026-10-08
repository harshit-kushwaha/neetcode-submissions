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

        // remove duplicates
        Set<Integer> dedup = new LinkedHashSet<>();
        dedup.addAll(Arrays.stream(nums).boxed().toList());

        // loop with counting conse.. and skip if no conse..
        int max = 1;
        int count = 1;
        Integer prev = null;

        for (int n: dedup){
            if (prev == null){
                prev = n;
                continue;
            }
            if (n - prev == 1){
                count++;
                if (count > max){
                    max = count;
                }
            } else {
                count = 1;
            }
            prev = n;
        }

        return max;

    }
}
