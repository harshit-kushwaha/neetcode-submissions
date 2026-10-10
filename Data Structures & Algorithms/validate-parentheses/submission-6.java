class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0){
            return true;
        }
        while (s.contains("[]") || s.contains("{}") || s.contains("()")){
            s = s.replace("[]", "");
            s = s.replace("{}", "");
            s = s.replace("()", "");
        }
        return s.isEmpty();
    }
}
