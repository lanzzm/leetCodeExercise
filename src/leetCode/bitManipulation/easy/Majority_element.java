package leetCode.bitManipulation;

import java.util.Arrays;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/majority-element/
 * leet code serial number:169
 * 众数 数组中超过一般的数
 */
public class Majority_element {
	
	// 中位数算法
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    //投票算法
    public int majorityElement_02(int[] nums) {
    	Integer mode = null;
    	int scout = 0;
    	for(int i=0;i<nums.length;i++){
    		if(mode==null){
    			mode=nums[i];
    			scout=1;
    		}else{
    			scout += mode == nums[i]?1:-1;
    			if(scout==0)
    				mode=null;
    		}
    	}
    	return mode;
    }    

}
