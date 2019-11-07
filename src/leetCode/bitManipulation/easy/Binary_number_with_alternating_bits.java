package leetCode.bitManipulation;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/binary-number-with-alternating-bits/
 * leet code serial number:693
 */
public class Binary_number_with_alternating_bits {
	
	//ºÍ  a = a&(a-1) ºÜÏñ
    public boolean hasAlternatingBits(int n) {
    	 int temp=n^(n>>1); 
    	 return (temp&(temp+1))==0;
    }

}
