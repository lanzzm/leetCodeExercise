package leetCode.bitManipulation;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/convert-a-number-to-hexadecimal/
 * leet code serial number:405
 */
public class Convert_a_number_to_hexadecimal {

	
    public String toHex(int num) {
    	if(num==0)
    		return "0";
    	String table = "0123456789abcdef";
    	StringBuffer result = new StringBuffer(8);
    	for(int i=0;i<8;i++){
    		int a = num&0xf;
    		result.append(table.charAt(a));
    		num>>=4;
    	}	
    	while(result.charAt(result.length()-1)=='0'){
    		result.setLength(result.length()-1);
    	}
    	return result.reverse().toString();
    }  
	
    
    public static void main(String[] args) {
		System.out.println(new Convert_a_number_to_hexadecimal().toHex(0));
	}
}
