class Solution {
    public int maxArea(int[] heights) {
        int max = 0;
        int i = 0, j = heights.length - 1;

        while (i < j){
            int vol = Math.min(heights[i], heights[j]) * (j-i);
            if (vol > max){
                max = vol;
            }

            if (heights[i] < heights[j]){
                int prevMax = heights[j];
                i++;
                // while (i < j && heights[i] < prevMax){
                //     i++;
                // }
            } else {
                int prevMax = heights[i];
                j--;
                // while (i < j && heights[j] < prevMax){
                //     j--;
                // }
            }
            
        }
        return max;
    }
}
