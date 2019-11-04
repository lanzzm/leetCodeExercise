package leetCode.stack;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/remove-outermost-parentheses/
 * leet code serial number:1021
 */

public class Remove_outermost_parentheses {
	public String removeOuterParentheses(String S) {
		//存储结果，StringBuffer 拼接性能优于String
		StringBuffer result = new StringBuffer();
		char [] a = S.toCharArray();
		//栈中剩余的左括号
		int leftCount = 0;
		//储存字符分界点左括号下标+1，因为题目要求不返回最外层括号
		int toSavePoint=1;
		for(int i=0;i<S.length();i++){
			if(a[i] == '('){
				leftCount++;
			}else{
				leftCount--;
			}
			// 栈目前状态为空栈，说明可以分割了
			if(leftCount==0){
				result.append(S.substring(toSavePoint,i+1));
				toSavePoint=i+1;
			}
		}
		return result.toString();
	}
}
