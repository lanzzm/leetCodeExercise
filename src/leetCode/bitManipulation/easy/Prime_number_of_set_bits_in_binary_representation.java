package leetCode.bitManipulation;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/prime-number-of-set-bits-in-binary-representation/
 * leet code serial number:762
 */
public class Prime_number_of_set_bits_in_binary_representation {

    public int countPrimeSetBits(int L, int R) {
    	int a=L;
    	int count=0;
    	for(int i=0;i<=(R-L);i++){
    		if(primeNumber(hammingWeight(L+i)))
    			count++;
    	}
    	return count;
    }
    //Integer.bitCount(i) ¿´¿´Ô´Âë
    private int hammingWeight(int a){
    	 
    	int result = 0;
    	
    	while(a!=0){
    		if(((a>>1)&1)== 1){
    			result++;
    		}
    	}
    	return result;
    }
    
    private boolean  primeNumber(int a){
    	if(a==0||a==1){
    		return false;
    	}
    	if(a==2){
    		return true;
    	}
    	for(int i=2;i<=a/2;i++){
    		if(a%i==0)
    			return false;
    	}
    	return true;
    }
    
    
   
    
    public int countPrimeSetBits_02(int L, int R) {
    	int count = 0;
    	for(int i=0;i<=(R-L);i++){
    		if(primeNumber(Integer.bitCount(L+i)))
    			count++;
    	}
    	return count;
    }
    
    
    
    
    
    
}
