package leetCode.bitManipulation.easy;

import java.util.ArrayList;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/single-number/
 * leet code serial number:136
 */
public class Single_number {
	
    public int singleNumber(int[] nums) {
        ArrayList<Integer> arrayList = new  ArrayList<Integer>();
        for(int foo:nums){
        	if(arrayList.contains(foo)){
        		arrayList.remove(new Integer(foo));
        	}else{
        		arrayList.add(foo);
        	}
        }
        return arrayList.get(0);
    }
    
    public int singleNumber_02(int[] nums) {
    	int result = 0;
    	for(int foo:nums){
    		result ^=foo;
    	}
    	return result;
    }    
    
    
    
    
    
    
    
    
    
    
    
}
