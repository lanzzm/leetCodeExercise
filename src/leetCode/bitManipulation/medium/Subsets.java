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
	 * ���и���˼· 
	 * 
	 * ���� [1,2,3] ���Ӽ�Ҳ�������е�����Ԫ��ȡ�벻ȡ����ϡ�
	 * ��������Ϊ�����Ƶ����� bit λ 1 1 1����ô�� 0 0 0 �� 1 1 1 �� 8 �������͹����������Ӽ���ѡȡ�����
	 * ���� 0 0 1 ��ʾȡ��1��Ԫ�أ�0 1 1 ��ʾȡǰ����Ԫ�ء�
	 */
    public List<List<Integer>> subsets(int[] nums) {
    	//�ж��ٸ��Ӽ�
    	int count = 1<<nums.length;
    	//���
    	 List<List<Integer>> result = new ArrayList<List<Integer>>();
    	//ȡÿ�����
    	for(int i=0;i<count;i++){
    		List<Integer> ls = new ArrayList<Integer>();
    		//������ǰ������������Ӽ�
    		for(int j=0;j<nums.length;j++){
    			//ȡj+1λ ���Ƿ�Ϊ1
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
