package task2x.task20;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c){
                case ')' : if (stack.isEmpty()) return false; else if (stack.peek() != '(') return false; else stack.pop(); break;
                case '}' : if (stack.isEmpty()) return false; else if (stack.peek() != '{') return false; else stack.pop(); break;
                case ']' : if (stack.isEmpty()) return false; else if (stack.peek() != '[') return false; else stack.pop(); break;
                default: stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
