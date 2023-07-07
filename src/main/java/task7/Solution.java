package task7;

public class Solution {

    public int reverse(int x) {
        String s = String.valueOf(x);
        StringBuilder resultString = new StringBuilder();
        boolean isNegative = false;
        if (s.charAt(0) == '-') {
            isNegative = true;
            s = s.substring(1);
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            resultString.append(s.charAt(i));
        }

        try {
            int result = Integer.parseInt(String.valueOf(resultString));
            return isNegative ? -result : result;
        }catch (NumberFormatException e){
            return 0;
        }
    }
}
