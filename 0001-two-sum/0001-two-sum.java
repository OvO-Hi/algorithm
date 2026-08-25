class Solution {
    public int[] twoSum(int[] nums, int target) {
        final var map = new HashMap<Integer, Integer>();
        for (int i = 0 ; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            final var exactNumber = target - nums[i];
            if (map.containsKey(exactNumber) && map.get(exactNumber) != i) {
                return new int[]{i, map.get(exactNumber)};
            }
        }
        return new int[]{0, 0};
    }
}