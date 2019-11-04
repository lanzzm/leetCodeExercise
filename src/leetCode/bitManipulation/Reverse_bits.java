package leetCode.bitManipulation;

import java.util.BitSet;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/reverse-bits/
 * leet code serial number:190
 */
public class Reverse_bits {
	
	//Դ���,̫����,������
    public int reverseBits(int n) {
    	return   Integer.reverse(n);  	
    }
    
    //�Լ�д�� n ^ 00100 ��ı�n���� �൱��ȡ��
    //     n & 00100  ֻ����1�ϵ�����
    //  n | 00101  ; ����� ǿ�иı��Ӧλ���ϵ�����
    public int reverseBits_02(int n) {
    	for(int i = 0;i<16;i++){
    		//ȡ�ұ�
    		int right = (n>>i)&1;
    		//ȡ���
    		int left = (n>>(31-i))&1;
    		//��ͬ ��
    		if(left==right)
    			continue;
    		//��ͬ ��任   
    		n = n ^ (1<<(31-i));
    		n = n ^ (1<<i);
    	}
    	return n;
    }   
    
    //���ѵ� ˼·�ܼ� ȡ���һλ Ȼ��������һ�����е� ��ô��?+���һλ ÿ��������һ�¾ͺ���
    public int reverseBits_03(int n) {
    	int ans = 0;
    	for(int i = 0;i<32;i++){
            ans<<=1;
            ans+=n&1;
            n>>=1;
    	}
    	return ans;
    }   
    
    
    
    
    public static void main(String[] args) {
    	//������ô�ɣ�
		System.out.println(2<<-1);
    	
	}
    
    
    
    
    
    
    
    
}
