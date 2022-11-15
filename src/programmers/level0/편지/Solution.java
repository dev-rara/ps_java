package programmers.level0.편지;

public class Solution {

	public int solution(String message) {
		char[] temp = message.toCharArray();
		int answer = temp.length;
		return answer * 2;
	}
}
