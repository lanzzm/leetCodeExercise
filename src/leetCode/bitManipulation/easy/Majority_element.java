package leetCode.bitManipulation;

import java.util.Arrays;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/majority-element/
 * leet code serial number:169
 * ���� �����г���һ�����
 */
public class Majority_element {
	
	// ��λ���㷨
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    //ͶƱ�㷨
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
