package task1x.task13;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int romanToInt(String s) {
        int r = 0;
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        for(int a = 0; a < s.length(); a++){
            int nextValue = romanMap.get(s.charAt(a));
            if(a + 1 < s.length()){
                int nextNextValue = romanMap.get(s.charAt(a+1));
                if(nextNextValue > nextValue){
                    r = r - nextValue;
                }else{
                    r = r + nextValue;
                }
            } else {
                r = r + nextValue;
            }
        }
        return r;
    }
}
