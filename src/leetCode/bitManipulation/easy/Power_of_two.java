package leetCode.bitManipulation.easy;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/power-of-two/
 * leet code serial number:231
 */
public class Power_of_two {
	
	
	// ��ʱ
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
    
    
    
	// 2�Ĵ�����ʲô�ص�!�Ǿ������м���1
    // ע���� �������� ��i=31ʱ�� �Ǹ��� ,���Բ���32 
    public boolean isPowerOfTwo_02(int n) {
    	for(int i = 0;i<31;i++){
    		if(1<<i == n){
    			return true; 
    		}
    	}
    	return false;
    }
    
    //�������̬
    public boolean isPowerOfTwo_03(int n) {
        if(n <= 0){
            return false;
        }
        return (n & (n - 1)) == 0;
    }
    
    
    
    //������ԭ����ȥ����ߵķ���λ������λ�� �����λȡ��Ϊ���룬����+1��Ϊ���롣
    public static void main(String[] args) {
		new Power_of_two().isPowerOfTwo_02(-2147483648);
		int i = -63;
		int j = 63;
		System.out.println(Integer.toBinaryString(j));
		System.out.println(Integer.toBinaryString(i));
	}
    
    
    
    
    
}
