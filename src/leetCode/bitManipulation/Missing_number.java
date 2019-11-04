package leetCode.bitManipulation;

import java.util.HashSet;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/missing-number/
 * leet code serial number:268
 * 
 * ��Ŀ�������Ǻܺã����ܴ�����ȷ�� ���� 012 ��һ��
 */
public class Missing_number {
    public int missingNumber(int[] nums) {
    	HashSet<Integer> hashSet = new HashSet<Integer>();
    	for(int foo:nums){
    		hashSet.add(foo);
    	}
    	for(int i=0;i<nums.length;i++){
    		if(!hashSet.contains(i))  
    		return i;
    	}
        return nums.length+1;
    }
    
    
    // 1^1^2^2^3 = 3
    public int missingNumber_02(int[] nums) {
        int res = nums.length;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ i ^ nums[i];
        }
        return res;
    }
    
    
    
	
}
