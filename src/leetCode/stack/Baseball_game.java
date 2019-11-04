package leetCode.stack;

import java.util.Stack;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/baseball-game/
 * leet code serial number:682
 */
public class Baseball_game {
    public int calPoints(String[] ops) {
    	Stack<Integer> stack = new Stack<Integer>();
    	for(String str:ops){
    		if("C".equals(str)){
    			stack.pop();
    		}else if("D".equals(str)){
    			stack.push(2*stack.peek());
    		}else if("+".equals(str)){
    			int a = stack.pop();
    			int b = stack.peek();
    			stack.push(a);
    			stack.push(a+b);
    		}else{
    			stack.push(Integer.parseInt(str));
    		}
    	}
    	int sum = 0;
    	while(!stack.isEmpty()){
    		sum+=stack.pop();
    	}
    	return sum ;
    }
}
