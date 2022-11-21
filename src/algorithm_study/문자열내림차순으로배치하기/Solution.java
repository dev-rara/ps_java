package algorithm_study.문자열내림차순으로배치하기;

import java.util.Arrays;

public class Solution {

	public String solution(String s) {
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);

		StringBuilder answer = new StringBuilder();
		answer.append(charArray).reverse();

		return answer.toString();
	}

}
