package leetCode.bitManipulation.easy;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/number-complement/
 * leet code serial number:476
 * ²¹Êı
 * 101   010
 */
public class Number_complement {
	
    public int findComplement(int num) {
    	int sum = num;
    	sum|=sum>>1;
    	sum|=sum>>2;
    	sum|=sum>>4;
    	sum|=sum>>8;
    	sum|=sum>>16;
        return sum-num;
    }
	
}
