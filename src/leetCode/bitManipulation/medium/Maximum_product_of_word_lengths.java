package leetCode.bitManipulation.medium;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/maximum-product-of-word-lengths/
 * leet code serial number:318
 */
public class Maximum_product_of_word_lengths {
	
    public int maxProduct(String[] words) {
    	HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
    	//ов╦Ь 
        for(int i=0;i<26;i++){
        	char a =(char)(32+i);
        	hashMap.put(a,1<<i);
        }
    	
    	
    }	
}
