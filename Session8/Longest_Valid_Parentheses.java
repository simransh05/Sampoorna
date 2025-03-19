package Session8;

import java.util.Stack;

public class Longest_Valid_Parentheses {
	public static int longestValidParentheses(String s) {
		int maxLen = 0;
		Stack<Integer> stk = new Stack<>();
		stk.push(-1);
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stk.push(i);
			} else {
				if (!stk.isEmpty() && stk.peek() != -1 && s.charAt(stk.peek()) == '(') {
					stk.pop();
					maxLen = Math.max(maxLen, i - stk.peek());
				} else {
					stk.push(i);
				}
			}
		}
		return maxLen;
	}

	public static void main(String[] args) {
		String s = ")()())";
		System.out.println(longestValidParentheses(s));
	}

}
