package leetCode.stack;

import java.util.Stack;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/remove-all-adjacent-duplicates-in-string/
 * leet code serial number:1047
 */
public class Remove_all_adjacent_duplicates_in_string {
	public String removeDuplicates(String S) {
		char[] chars = S.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		StringBuffer sb = new StringBuffer();
		for (char foo : chars) {
			if (stack.isEmpty()) {
				stack.push(foo);
				continue;
			}
			if (stack.peek() == foo) {
				stack.pop();
				continue;
			}
			stack.push(foo);
		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.reverse().toString();
	}
}
