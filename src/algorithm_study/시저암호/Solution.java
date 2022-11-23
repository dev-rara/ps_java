package algorithm_study.시저암호;

public class Solution {

	public String solution(String s, int n) {
		StringBuilder answer = new StringBuilder();
		char[] charArray = s.toCharArray();

		for (char c : charArray) {
			if (c == ' ') {
				answer.append(" ");
			} else if (c >= 'a' && c <= 'z') {
				answer.append((char) ('a' + (c + n - 'a') % 26));
			} else if (c >= 'A' && c <= 'Z') {
				answer.append((char) ('A' + (c + n - 'A') % 26));
			}
		}

		return answer.toString();
	}
}
