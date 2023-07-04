package task3;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthOfLongestSubstring(String s) {
        int length = s.length();
        int i = 0;
        int j = 0;
        int result = 0;
        Set<Character> set = new HashSet<>();
        while (i < length && j < length){
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                result = Math.max(result, j - i);
            }
            else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return result;
    }
}
