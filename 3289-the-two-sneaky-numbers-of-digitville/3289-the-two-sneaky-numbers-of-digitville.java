import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        int[] result = new int[2];
        int idx = 0;
        
        for (int num : nums) {
            if (!seen.add(num)) {
                result[idx++] = num;
                if (idx == 2) {
                    break; 
                }
            }
        }
        
        return result;
    }
}