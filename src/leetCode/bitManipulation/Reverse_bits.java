package leetCode.bitManipulation;

import java.util.BitSet;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/reverse-bits/
 * leet code serial number:190
 */
public class Reverse_bits {
	
	//源码版,太神仙,看不懂
    public int reverseBits(int n) {
    	return   Integer.reverse(n);  	
    }
    
    //自己写的 n ^ 00100 会改变n的数 相当于取反
    //     n & 00100  只保留1上的数字
    //  n | 00101  ; 这个是 强行改变对应位置上的数字
    public int reverseBits_02(int n) {
    	for(int i = 0;i<16;i++){
    		//取右边
    		int right = (n>>i)&1;
    		//取左边
    		int left = (n>>(31-i))&1;
    		//相同 不
    		if(left==right)
    			continue;
    		//不同 则变换   
    		n = n ^ (1<<(31-i));
    		n = n ^ (1<<i);
    	}
    	return n;
    }   
    
    //网友的 思路很简单 取最后一位 然后塞到另一个数中的 怎么塞?+最后一位 每次往左移一下就好了
    public int reverseBits_03(int n) {
    	int ans = 0;
    	for(int i = 0;i<32;i++){
            ans<<=1;
            ans+=n&1;
            n>>=1;
    	}
    	return ans;
    }   
    
    
    
    
    public static void main(String[] args) {
    	//不能这么干！
		System.out.println(2<<-1);
    	
	}
    
    
    
    
    
    
    
    
}
