package leetCode.bitManipulation;

/**
 * @author lanzm
 * link:https://leetcode-cn.com/problems/hamming-distance/
 * leet code serial number:461
 * 汉明距离：它就是将一个字符串变换成另外一个字符串所需要替换的字符个数
 */
public class Hamming_distance {
    public int hammingDistance(int x, int y) {
    	return Integer.bitCount(x^y);
    }
}
