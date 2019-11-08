package leetCode.bitManipulation.medium;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/integer-replacement/
 * leet code serial number:397
 */
public class Integer_replacement {
	
    public int integerReplacement(int n) {
    	int ans = 0;
    	while(n!=1){
        	if((n&1)==0){
        		n=n>>>2;
        		ans++;
        	}else{
        		if(n==3||n==Integer.MAX_VALUE){
        			n--;
        		}else if((n&2)==2){
        			n++;
        		}else{
        			n--;
        		}
        		ans++;
        	}
    	}
        return ans;
    }
    
    
    
    public static void main(String[] args) {
		
	}
    
    
    
    
    
    
    
}
