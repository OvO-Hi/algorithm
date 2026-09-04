class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2*n];

        // nums에서 0~n-1까지랑 n부터2n-1까지를 나눠야할듯
        // 그리고서 각각 for문을 돌려... 첫번째는 홀수자리에, 두번째는 짝수자리에 넣어야함... 
        for (int i=0; i<n; i++) {
            
            result[2*i] = nums[i];
            result[2*i+1] = nums[i+n];
            
        }
        return result;
        
    }
}