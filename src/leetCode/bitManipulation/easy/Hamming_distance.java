package leetCode.bitManipulation;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/hamming-distance/
 * leet code serial number:461
 * �������룺�����ǽ�һ���ַ����任������һ���ַ�������Ҫ�滻���ַ�����
 */
public class Hamming_distance {
    public int hammingDistance(int x, int y) {
    	return Integer.bitCount(x^y);
    }
}
