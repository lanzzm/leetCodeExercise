package leetCode.bitManipulation.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/repeated-dna-sequences/
 * leet code serial number:187
 */
public class Repeated_dna_sequences {
	
	
    public List<String> findRepeatedDnaSequences(String s) {
    	List<String> ans = new ArrayList<String>();
    	HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
        for(int i=0;i+9<s.length();i++){
        	String foo = s.substring(i, i+10);
        	if(hashMap.containsKey(foo)){
        		if(!ans.contains(foo))
        			ans.add(foo);
        	}
        	hashMap.put(foo, 1);
        }
    	return ans;
    }
    public static void main(String[] args) {
    	System.out.println(new Repeated_dna_sequences().findRepeatedDnaSequences("AAAAAAAAAAA"));
	}
}
