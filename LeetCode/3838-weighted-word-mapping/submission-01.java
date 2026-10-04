class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();
        
        for (String word : words) {
            int totalWeight = 0;
            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                totalWeight += weights[ch - 'a'];
            }
            int remainder = totalWeight % 26;
            char mappedChar = (char) ('z' - remainder);
            sb.append(mappedChar);
        }
        
        return sb.toString();
    }
}