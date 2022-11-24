package programmers.level0.대문자와소문자;

import java.util.Arrays;

public class Solution {
	public String solution(String my_string) {
		String[] str = my_string.split("");
		StringBuilder answer = new StringBuilder();

		for (int i = 0; i < str.length; i++) {
			if (str[i].matches(".*[A-Z].*")) {
				answer.append(str[i].toLowerCase());
			} else {
				answer.append(str[i].toUpperCase());
			}
		}
		return answer.toString();
	}
}
