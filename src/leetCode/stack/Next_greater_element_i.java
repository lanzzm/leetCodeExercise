package leetCode.stack;

import java.util.HashMap;
import java.util.Stack;

import org.junit.Test;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/next-greater-element-i/
 * leet code serial number:496
 */
public class Next_greater_element_i {
	
	
	
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Stack<Integer> stack = new Stack<Integer>();
		int[] result = new int[nums1.length];
		for(int foo:nums1){
			int pointIndex = -1;
			for(int i=0;i<nums2.length;i++){
				if(foo==nums2[i]){
					pointIndex=i;
					if(i == nums2.length-1)
						stack.push(-1);
					continue;
				}
				if(pointIndex==-1)
					continue;
				if(nums2[i]>nums2[pointIndex]){
					stack.push(nums2[i]);
					break;
				}else if(i == nums2.length-1){
					stack.push(-1);
				}
			}
		}
		int bar = nums1.length;
		while(!stack.isEmpty()){
			result[--bar] = stack.pop();
		}
		return result;
	}
	
	
	
    public int[] nextGreaterElement_02(int[] nums1, int[] nums2) {
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer, Integer> hasMap = new HashMap<Integer, Integer>();
        
        int[] result = new int[nums1.length];
        
        for(int num : nums2) {
            while(!stack.isEmpty() && stack.peek()<num){
                hasMap.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        for(int i = 0; i < nums1.length; i++) result[i] = hasMap.getOrDefault(nums1[i], -1);
            
        return result;
    }
	
	
	
	
	public static void main(String[] args) {
		new Next_greater_element_i().nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2});
		
	}
	

	
	
	
}
