package programmers.level0.중복된문자제거;

public class Solution {

	public String solution(String my_string) {
		String[] str = my_string.split("");
		StringBuilder answer = new StringBuilder();

		for (String s : str) {
			if (!answer.toString().contains(s)) {
				answer.append(s);
			}
		}
		return answer.toString();
	}
}
