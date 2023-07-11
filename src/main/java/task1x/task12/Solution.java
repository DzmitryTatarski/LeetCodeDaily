package task1x.task12;

public class Solution {

    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] arabicValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        for (int i = 0; i < romanNumerals.length; i++) {
            while (num >= arabicValues[i]) {
                result.append(romanNumerals[i]);
                num -= arabicValues[i];
            }
        }
        return result.toString();
    }
}
