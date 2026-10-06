class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] freq = new int[20001];

        for (int n: nums){
            freq[n+10000]++;
        }

        int[] res = new int[k];

        int max = 0;
        int index = 0;

        for (int i = 0; i < k; i++){
            for (int j = 0; j < 20001; j++){
                if (freq[j] > max){
                    max = freq[j];
                    index = j;
                }
            }

            res[i] = index - 10000;
            freq[index] = 0;
            max = 0;
        }

        return res;
    }

}
