package leetCode.bitManipulation.easy;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/number-of-1-bits/
 * leet code serial number:191
 * ��дһ��������������һ���޷�������������������Ʊ��ʽ������λ��Ϊ ��1�� �ĸ�����Ҳ����Ϊ������������
 * 
 */
public class Number_of_1_bits {
	
    public int hammingWeight(int n) {
        int result = 0;
    	for(int i=0;i<32;i++){
    		int foo = (n>>i)&1;
    		if(foo==1)
    			result++;
    	}
    	return result;
    }	
    
	//���� ������˰ѣ�
    public int hammingWeight_02(int n) {
        int ans=0;
        while(n!=0)
        {
            ans+=n%2;
            n>>=1;
        }
        return ans;
    }	
    
    
    
    public int hammingWeight_03(int n) {

        return Integer.bitCount(n);
    }
    
    
}
