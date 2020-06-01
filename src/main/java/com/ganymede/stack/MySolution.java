package com.ganymede.stack;

import java.util.Stack;

public class MySolution {
    public static void main(String[] args) {
        MySolution solution = new MySolution();
        boolean flag = solution.isValid("{[()]}");
        System.out.println(flag);

        flag = solution.isValid("{[(]}");
        System.out.println(flag);
    }

    public boolean isValid(String s) {
        ArrayStack<Character> stack = new ArrayStack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{')
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return false;

                char topChar = stack.pop();
                if (c == ')' && topChar != '(')
                    return false;
                if (c == ']' && topChar != '[')
                    return false;
                if (c == '}' && topChar != '{')
                    return false;
            }
        }
        return stack.isEmpty();
    }
}

