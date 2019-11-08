package leetCode.bitManipulation.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/subsets/
 * leet code serial number:78
 */
public class Subsets {
	
	/**
	 * 这有个好思路 
	 * 
	 * 数组 [1,2,3] 的子集也就是其中的三个元素取与不取的组合。
	 * 把它想象为二进制的三个 bit 位 1 1 1，那么从 0 0 0 到 1 1 1 的 8 个数，就构成了所有子集的选取情况。
	 * 比如 0 0 1 表示取第1个元素，0 1 1 表示取前两个元素。
	 */
    public List<List<Integer>> subsets(int[] nums) {
    	//有多少个子集
    	int count = 1<<nums.length;
    	//结果
    	 List<List<Integer>> result = new ArrayList<List<Integer>>();
    	//取每种情况
    	for(int i=0;i<count;i++){
    		List<Integer> ls = new ArrayList<Integer>();
    		//分析当前情况的所含的子集
    		for(int j=0;j<nums.length;j++){
    			//取j+1位 看是否为1
    			if (1 == ((i>>j)&1)){
    				ls.add(nums[j]);
    			}
    		}
    		result.add(ls);
    	}
    	return result;
    }
	
    public static void main(String[] args) {
		System.out.println(new Subsets().subsets(new int[]{1,2,3}));
	}
	
	
}
