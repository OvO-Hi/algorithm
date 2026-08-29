class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] newnums = new int[n*2];

        for (int k=0; k < n; k++) {
            newnums[k] = nums[k];
            newnums[k+n] = nums[k];
        }
        return newnums;
    }
}