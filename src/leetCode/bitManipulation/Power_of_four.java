package leetCode.bitManipulation;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/power-of-four/
 * leet code serial number:342
 */
public class Power_of_four {
    public boolean isPowerOfFour(int num) {
    	if(num<0||((num&num-1)!=0)){
    		return false;
    	}
    	return num%3==1;
    }
}
