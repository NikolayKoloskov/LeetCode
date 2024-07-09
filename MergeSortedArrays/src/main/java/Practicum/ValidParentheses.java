package Practicum;

import java.util.ArrayList;

/**
 * 20. Valid Parentheses EASY https://leetcode.com/problems/valid-parentheses/description/
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                list.add(c);
            } else {
                if (list.isEmpty()) {
                    return false;
                }
                char top = list.get(list.size() - 1);
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    list.remove(list.size() - 1);
                } else {
                    return false;
                }
            }
        }
        return list.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid("()"));
        System.out.println(validParentheses.isValid("()[]{}"));
        System.out.println(validParentheses.isValid("(]"));
        System.out.println(validParentheses.isValid("([)]"));
        System.out.println(validParentheses.isValid("{[]}"));
        System.out.println(validParentheses.isValid(""));
        System.out.println(validParentheses.isValid("{"));
    }
}
