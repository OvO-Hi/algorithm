class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i =0; i < accounts.length; i++) {
            int sum = 0;
            for (int k = 0; k<accounts[i].length; k++) {
                sum = sum + accounts[i][k];
            }
            if (sum>max) {
                max = sum;
            }
            
        }
        return max;
    }
}