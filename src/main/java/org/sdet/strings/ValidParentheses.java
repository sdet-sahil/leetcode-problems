package org.sdet.strings;

import java.util.Stack;

public class ValidParentheses {
    static boolean isOpenBracket(char ch){
        return ch == '{' || ch == '(' || ch == '[';
    }
    static boolean isValidParentheses(String input){
        if(input.length()%2 == 1)
            return false;
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i< input.length(); i++){
            char curr = input.charAt(i);
            if(isOpenBracket(curr)){
                stk.add(curr);
            } else {
                if( !stk.isEmpty() && ((curr == '}' && stk.peek() == '{') || (curr == ')' && stk.peek() == '(') || (curr == ']' && stk.peek() == '[')))
                    stk.pop(); else return false;
            }
        }
     return stk.isEmpty();
    }
    public static void main(String[] args){
        System.out.println(isValidParentheses("()[]{}")); // true
        System.out.println(isValidParentheses("(")); // false
        System.out.println(isValidParentheses("()")); // true
        System.out.println(isValidParentheses("([])")); // true
        System.out.println(isValidParentheses("][")); // false
    }
}
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true



Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */
