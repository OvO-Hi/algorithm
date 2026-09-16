class Solution {
    public int digitFrequencyScore(int n) {
         String numStr = String.valueOf(n);
        int res = 0;
        for (char numChar : numStr.toCharArray()) {
            res += numChar - '0';
        }
        return res;
    }
}