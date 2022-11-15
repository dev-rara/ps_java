package programmers.level0.특정문자제거하기;

public class Solution {

	public String solution(String my_string, String letter) {
		String answer = my_string.replaceAll(letter, "");
		return answer;
	}
}
