package programmers.level0.문자열뒤집기;

public class Solution {

	public String solution(String my_string) {
		char[] temp = my_string.toCharArray();
		char[] answer = new char[temp.length];

		for (int i = 0; i < temp.length; i++) {
			answer[i] = temp[temp.length - 1 - i];
		}
		return String.valueOf(answer);
	}
}
