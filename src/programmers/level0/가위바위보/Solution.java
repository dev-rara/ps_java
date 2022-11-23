package programmers.level0.가위바위보;

public class Solution {

	public String solution(String rsp) {
		StringBuilder answer = new StringBuilder();
		String[] str = rsp.split("");

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("2")) {
				answer.append("0");
			} else if (str[i].equals("0")) {
				answer.append("5");
			} else if (str[i].equals("5")) {
				answer.append("2");
			}
		}

		return answer.toString();
	}
}
