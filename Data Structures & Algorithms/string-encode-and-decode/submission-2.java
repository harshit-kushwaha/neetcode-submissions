class Solution {

    public String encode(List<String> strs) {
        final StringBuilder sb = new StringBuilder();
        for (String s: strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();

        char[] chars = str.toCharArray();

        int len = 0;

        int i = 0;
        while (i < chars.length){
            if (len == 0) {
                while (chars[i] != '#'){
                    len = (len*10) + Character.getNumericValue(chars[i++]);
                }

                char[] word = Arrays.copyOfRange(chars, i+1, i+len+1);
                res.add(new String(word));
                i += len+1;
                len = 0;
            }
        }

        return res;
        
    }
}
