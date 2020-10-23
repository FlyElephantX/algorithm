package com;

import java.util.Stack;

public class Bracket {

    public boolean isMatch(String str) {
        if (str.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if (cur == '(' || cur == '[' || cur == '{') {
                stack.push(cur);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                Character top = stack.pop().charValue();
                if (cur == ')' && top != '(') {
                    return false;
                }
                if (cur == ']' && top != '[') {
                    return false;
                }
                if (cur == '}' && top != '{') {
                    return false;
                }
            }
        }
        return stack.size() == 0 ? true : false;
    }
}
