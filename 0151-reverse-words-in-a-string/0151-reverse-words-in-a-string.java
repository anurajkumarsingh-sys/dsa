class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int i; 
        int j;
        
        for (i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                continue;
            }
            
            j = i;
            
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            
            if (sb.length() == 0) {
                sb.append(s.substring(i + 1, j + 1));
            } else {
                sb.append(" ").append(s.substring(i + 1, j + 1));
            }
        }
        
        return sb.toString();
    }
}