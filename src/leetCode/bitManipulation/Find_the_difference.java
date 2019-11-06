package leetCode.bitManipulation;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/find-the-difference/
 * leet code serial number:389
 */
public class Find_the_difference {
		
    public char findTheDifference(String s, String t) {
    	char result=0;
    	for(char foo:s.toCharArray()){
    		result^=foo;
    	}
    	for(char bar:t.toCharArray()){
    		result^=bar;
    	}   	
    	return result;
    }
}
