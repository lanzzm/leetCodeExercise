package leetCode.stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/valid-parentheses/
 * leet code serial number:20
 */
public class Valid_parentheses {
    public boolean isValid(String s) {
    	//只是为了方便维护，可添加需要对应的东西
    	ArrayList<Character> arrayList = new ArrayList<Character>();
    	arrayList.add('(');
    	arrayList.add('{');
    	arrayList.add('[');
    	Stack<Character> stack = new Stack<Character>();
    	
    	HashMap<Character, Character> hashmap = new HashMap<Character, Character>();
    	hashmap.put('(', ')');
    	hashmap.put('{', '}');
    	hashmap.put('[', ']');
    	char [] inputStrChars = s.toCharArray();
    	for(char foo:inputStrChars){
    		if(arrayList.contains(foo)){
    			stack.push(foo);
    		}else{
    			if(stack.isEmpty())
    				return false;
    			char bar =  stack.pop();
    			if(hashmap.get(bar)!=foo)
    				return false;
    		}
    	}
        return stack.isEmpty();
    }
    /**
     * 优化一下
     * @param s
     * @return
     */
    public boolean isValid_02(String s) {
    	// 更加可以 &1==1
		if (s.length() % 2 != 0)
			return false;
		char[] inputStrChars = s.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (char foo : inputStrChars) {
			if (foo == '(' || foo == '[' || foo == '{') {
				stack.add(foo);
			} else {
				if (stack.isEmpty())
					return false;
				char top = stack.pop();
				if(foo - top<=2&&foo - top>0){
					continue;
				}
				return false;
			}
		}
		return stack.isEmpty();
    }   
}
