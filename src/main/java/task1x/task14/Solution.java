package task1x.task14;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder r = new StringBuilder();

        int minLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minLength = Math.min(strs[i].length(), minLength);
        }

        if (minLength == 0)
            return "";

        int index = 0;
        while (index < minLength){
            for (int i = 0; i < strs.length - 1; i++) {
                if (strs[i].charAt(index) != strs[i + 1].charAt(index))
                    return String.valueOf(r);
            }
            r.append(strs[0].charAt(index));
            index++;
        }

        return String.valueOf(r);
    }
}
