package leetCode.stack;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/remove-outermost-parentheses/
 * leet code serial number:1021
 */

public class Remove_outermost_parentheses {
	public String removeOuterParentheses(String S) {
		//�洢�����StringBuffer ƴ����������String
		StringBuffer result = new StringBuffer();
		char [] a = S.toCharArray();
		//ջ��ʣ���������
		int leftCount = 0;
		//�����ַ��ֽ���������±�+1����Ϊ��ĿҪ�󲻷������������
		int toSavePoint=1;
		for(int i=0;i<S.length();i++){
			if(a[i] == '('){
				leftCount++;
			}else{
				leftCount--;
			}
			// ջĿǰ״̬Ϊ��ջ��˵�����Էָ���
			if(leftCount==0){
				result.append(S.substring(toSavePoint,i+1));
				toSavePoint=i+1;
			}
		}
		return result.toString();
	}
}
