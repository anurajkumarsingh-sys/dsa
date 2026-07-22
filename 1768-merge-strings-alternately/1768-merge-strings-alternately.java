class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] st = new char[word1.length() + word2.length()]; 
        int i = 0;
        int j = 0;
        int k = 0;


        while (i < word1.length() && j < word2.length()) {
            st[k++] = word1.charAt(i++);
            st[k++] = word2.charAt(j++); 
        }

      
        while (i < word1.length()) {
            st[k++] = word1.charAt(i++);
        }

        
        while (j < word2.length()) {
            st[k++] = word2.charAt(j++);
        }
        return new String(st); 
    }
}