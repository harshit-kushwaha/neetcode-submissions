class Solution {
    public boolean isPalindrome(String s) {

        // create 2 pointers
        // iterate till both pointer cross / meet
            // skip spaces. 
        // if no mismatch during iternation then true, else false. 

        s = s.replaceAll("[^A-Za-z0-9]", "");
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;

        while (i < j){
            if (s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
