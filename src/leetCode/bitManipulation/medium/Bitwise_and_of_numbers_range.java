package leetCode.bitManipulation.medium;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/bitwise-and-of-numbers-range/
 * leet code serial number:201
 * 
 * 其实就是寻找左边连续相同的同位 如果位数不一致,肯定是0
 */
public class Bitwise_and_of_numbers_range {
	
    public int rangeBitwiseAnd(int m, int n) {
    	int offset = 0;
    	while(m!=n){
    		m>>=1;
    		n>>=1;
    		offset++;
    	}
    	return n<<offset;
    }
}
