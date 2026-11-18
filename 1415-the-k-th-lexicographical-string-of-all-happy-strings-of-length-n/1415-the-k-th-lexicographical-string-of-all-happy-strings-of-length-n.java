import java.util.*;

class Solution {
    List<String> list = new ArrayList<>();
    
    public String getHappyString(int n, int k) {
        backtrack(n, new StringBuilder());
        if (list.size() < k) {
            return "";
        }
        return list.get(k - 1);
    }
    
    private void backtrack(int n, StringBuilder sb) {
        if (sb.length() == n) {
            list.add(sb.toString());
            return;
        }
        
        char[] chars = {'a', 'b', 'c'};
        for (char c : chars) {
            if (sb.length() > 0 && sb.charAt(sb.length() - 1) == c) {
                continue;
            }
            sb.append(c);
            backtrack(n, sb);
            sb.deleteCharAt(sb.length() - 1); 
        }
    }
}
