class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] freq = new int[26];
        for (char c: s1.toCharArray()){
            freq[c - 97]++;
        }

        // O(n)
        int left = 0;
        int windowSize = s1.length();

        while (left <= s2.length() - windowSize){
            int right = left + windowSize - 1;
            // System.out.println(s2.substring(left, right+1));
            int[] counter = new int[26];
            int i = left;
            while (i <= right){
                // System.out.println("Checkig char: " + s2.charAt(i));
                if (freq[s2.charAt(i) - 97] == 0){ // if character is in-valid
                    break;
                } 

                counter[s2.charAt(i) - 97]++;
                
                if (counter[s2.charAt(i) - 97] > freq[s2.charAt(i) - 97]) {
                    break;
                }
                i++;
            }
            if (Arrays.equals(counter, freq)) return true;
            left += 1;
        }
        return false;
    }
}
