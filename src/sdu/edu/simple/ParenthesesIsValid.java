package sdu.edu.simple;

import java.util.Stack;

/**
 * Author       刘伯栋
 * Version      1.0
 * Date:        2019/10/29 下午4:07
 * Description: https://leetcode-cn.com/problems/valid-parentheses/
 */
public class ParenthesesIsValid {

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
        System.out.println(isValid("{[]}"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                switch (stack.peek()) {
                    case '(':
                        if (c == ')') {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                        break;
                    case '[':
                        if (c == ']') {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                        break;
                    case '{':
                        if (c == '}') {
                            stack.pop();
                        } else {
                            stack.push(c);
                        }
                        break;
                    default:
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
