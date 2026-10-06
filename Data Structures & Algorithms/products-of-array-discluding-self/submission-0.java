class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] prefixProduct = new int[nums.length];
        int[] suffixProduct = new int[nums.length];

        int prevPrefixProduct = 1;
        int prevSuffixProduct = 1;

        for (int i = 0; i < nums.length; i++){
            prevPrefixProduct *= nums[i];
            prefixProduct[i]  = prevPrefixProduct;

            suffixProduct[nums.length - 1 - i] = prevSuffixProduct * nums[nums.length - 1 - i];
            prevSuffixProduct = suffixProduct[nums.length - 1 - i];
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++){
            if (i == 0){
                res[i] = suffixProduct[i + 1];
            } else if(i == nums.length - 1){
                res[i] = prefixProduct[i - 1];
            } else {
                res[i] = prefixProduct[i - 1] * suffixProduct[i + 1];
            }
        }

        return res;
    }
}  
