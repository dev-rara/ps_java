package programmers.level0.이진수더하기;

public class Solution {

	public String solution(String bin1, String bin2) {
		String answer = "";

		int numA = Integer.parseInt(bin1, 2);
		int numB = Integer.parseInt(bin2, 2);
		answer = Integer.toBinaryString(numA + numB);

		return answer;
	}
}
