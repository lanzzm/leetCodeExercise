package leetCode.bitManipulation.easy;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/number-of-1-bits/
 * leet code serial number:191
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 * 
 */
public class Number_of_1_bits {
	
    public int hammingWeight(int n) {
        int result = 0;
    	for(int i=0;i<32;i++){
    		int foo = (n>>i)&1;
    		if(foo==1)
    			result++;
    	}
    	return result;
    }	
    
	//求余 这个慢了把，
    public int hammingWeight_02(int n) {
        int ans=0;
        while(n!=0)
        {
            ans+=n%2;
            n>>=1;
        }
        return ans;
    }	
    
    
    
    public int hammingWeight_03(int n) {

        return Integer.bitCount(n);
    }
    
    
}
