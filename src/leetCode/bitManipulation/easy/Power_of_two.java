package leetCode.bitManipulation.easy;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/power-of-two/
 * leet code serial number:231
 */
public class Power_of_two {
	
	
	// 超时
    public boolean isPowerOfTwo(int n) {
    	if(n<0){
    		return false;
    	}
    	int i=0;
    	do{
    		if(1<<i == n)
    			return true; 
    		i++;
    	}while(1<<i <=n);
        return false;
    }
    
    
    
	// 2的次幂有什么特点!那就是他有几个1
    // 注意了 负数不是 当i=31时候 是负数 ,所以不能32 
    public boolean isPowerOfTwo_02(int n) {
    	for(int i = 0;i<31;i++){
    		if(1<<i == n){
    			return true; 
    		}
    	}
    	return false;
    }
    
    //这个更变态
    public boolean isPowerOfTwo_03(int n) {
        if(n <= 0){
            return false;
        }
        return (n & (n - 1)) == 0;
    }
    
    
    
    //负数的原码是去掉最高的符号位的其他位， 后面的位取反为反码，反码+1后为补码。
    public static void main(String[] args) {
		new Power_of_two().isPowerOfTwo_02(-2147483648);
		int i = -63;
		int j = 63;
		System.out.println(Integer.toBinaryString(j));
		System.out.println(Integer.toBinaryString(i));
	}
    
    
    
    
    
}
