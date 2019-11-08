package leetCode.bitManipulation.easy;

import java.util.BitSet;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/reverse-bits/
 * leet code serial number:190
 */
public class Reverse_bits {
	
	//Դ���,̫����,������
    public int reverseBits(int i) {
    	
    	
    	//Integer.reverse(n) Դ��
        // HD, Figure 7-1
    	
    	//ȥ����λ Ȼ�������ƶ�һλ ż��λ �����ƶ�һλȻ��ȡ����λ,����Ͻ�� 
    	// ��ʵ������ż����
    	// 0101
        i = (i & 0x55555555) << 1 | (i >>> 1) & 0x55555555;
        // 0011        
        i = (i & 0x33333333) << 2 | (i >>> 2) & 0x33333333;
        // 1111
        i = (i & 0x0f0f0f0f) << 4 | (i >>> 4) & 0x0f0f0f0f;
        // ��ͷ���� �м�Ҳ����   
        i = (i << 24) | ((i & 0xff00) << 8) |
            ((i >>> 8) & 0xff00) | (i >>> 24);
    	
    	return  i  ;  
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
