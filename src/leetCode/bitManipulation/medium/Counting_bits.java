package leetCode.bitManipulation.medium;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/counting-bits/
 * leet code serial number:338
 */
public class Counting_bits {
	
    public int[] countBits(int num) {
    	int [] ans = new int[num+1];
    	for(int i=0;i<=num;i++){
    		ans[i]=Integer.bitCount(i);
    	}
    	return ans;
    }
	

    
    public int[] countBits_02(int num) {
    	int [] ans = new int[num+1];
    	for(int i=0;i<=num;i++){
    		ans[i]=ans[i>>1]+(i&1);
    	}
    	return ans;
    }   
    
    // 初始化默认就是0
    public int[] countBits_03(int num) {
    	int [] ans = new int[num+1];
    	for(int i=1;i<=num;i++){
    		ans[i]=ans[i&(i-1)]+1;
    	}
    	return ans;
    } 
    

    
}
