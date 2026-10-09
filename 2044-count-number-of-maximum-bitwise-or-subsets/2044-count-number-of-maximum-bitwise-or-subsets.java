class Solution {
    private int maxOr;
    private int ans;
    private int[] nums;

    public int countMaxOrSubsets(int[] nums) {
        this.nums = nums;
        this.maxOr = 0;
        
        for (int x : nums) {
            maxOr |= x;
        }
        
        dfs(0, 0);
        return ans;
    }

    private void dfs(int i, int currentOr) {
        if (i == nums.length) {
            if (currentOr == maxOr) {
                ans++;
            }
            return;
        }

        dfs(i + 1, currentOr);

        dfs(i + 1, currentOr | nums[i]);
    }
}