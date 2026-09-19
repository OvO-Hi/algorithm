import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < words.length; i++) {
            // indexOf(x)가 -1이 아니면 문자가 포함되어 있다는 의미입니다.
            if (words[i].indexOf(x) != -1) {
                result.add(i);
            }
        }
        
        return result;
    }
}