package leetCode.stack;

import java.util.Objects;
import java.util.Stack;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/backspace-string-compare/
 * leet code serial number:844
 */
public class Backspace_string_compare {
	
	
    public boolean backspaceCompare(String S, String T) {
    	S = this.getOriginalStr(S);
    	T = this.getOriginalStr(T);
    	return Objects.equals(S, T);
    }
    
    private String getOriginalStr(String str){
    	StringBuffer sb = new StringBuffer();
    	char [] chars = str.toCharArray();
    	Stack<Character> stack = new Stack<Character>();
    	for(char foo:chars){
    		if(foo=='#'){
    			if(stack.isEmpty())
    				continue;
    			stack.pop();
    		}else{
    			stack.push(foo);
    		}
    	}
    	while(!stack.isEmpty()){
    		sb.append(stack.pop());
    	}
    	return sb.toString();
    }
}
