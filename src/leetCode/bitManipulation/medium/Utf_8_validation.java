package leetCode.bitManipulation.medium;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/utf-8-validation/
 * leet code serial number:393
 */
public class Utf_8_validation {
	
	
    public boolean validUtf8(int[] data) {
        for(int foo:data){
        	if(foo>=0xf<<28&&foo<0){//4byte
        		if(!((foo&0xF8C0C0C0)==0xF0808080)){
        			return false;
        		}
        	}else if(foo>=7<<21){//3byte‭
        		if(!((foo&0xF0C0C0)==0xE08080)){
        			return false;
        		}       				
        	}else if(foo>=3<<14){
        		if(!((foo&0xE0C0)==0xC080)){
        			return false;
        		}        		
        	}else if(foo<1<<7){
        		if(!((foo&(1<<7))==0)){
        			return false;
        		} 
        	}else{
        		return false;
        	}
        }
        return true;
    }
    
    
    
    public boolean validUtf8_02(int[] data) {
    	int foo =0;
        for(int i=0;i<data.length;i++){
        	
        	foo += data[i]<<((data.length-i-1)*8);
        	System.out.println(Integer.toBinaryString(foo));
        }
        System.out.println(Integer.toBinaryString(foo));
    	if(data.length==4){
    		if(!((foo&0xF8C0C0C0)==0xF0808080)){
    			return false;
    		}
    	}else if(data.length==3){
    		if(!((foo&0xF0C0C0)==0xE08080)){
    			return false;
    		}  
    	}else if(data.length==2){
    		if(!((foo&0xE0C0)==0xC080)){
    			return false;
    		}  
    	}else if(data.length==1){
    		if(!((foo&(1<<7))==0)){
    			return false;
    		}    		
    	}else{
    		return false;
    	}
        return true;
    }
    
    
    

    public static void main(String[] args) {
		System.out.println(new Utf_8_validation().validUtf8_02(new int[]{197,130,1}));
	}
    
    
    
    
    
    
    
    
    
    
    

}
