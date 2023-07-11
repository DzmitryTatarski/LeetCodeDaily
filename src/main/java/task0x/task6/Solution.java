package task0x.task6;

public class Solution {

    public String convert(String s, int numRows){
        if (s.length() <= 1 || numRows <= 1)
            return s;
        int indexLetter = 0;
        boolean b = false;
        StringBuilder[] strings = new StringBuilder[numRows];
        for (int j = 0; j < strings.length; j++) {
            strings[j] = new StringBuilder();
        }
        for (char c : s.toCharArray()){
            strings[indexLetter].append(c);
            if (indexLetter == 0 || indexLetter == numRows - 1)
                b = !b;
            indexLetter += b ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder string : strings) {
            result.append(string);
        }
        return result.toString();
    }
}
