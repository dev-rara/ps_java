package algorithm_study.문자열내마음대정렬하기;

import java.util.Arrays;

public class Solution {

	public String[] solution(String[] strings, int n) {
		for (int i = 0; i < strings.length; i++) {
			strings[i] = strings[i].charAt(n) + strings[i];
		}

		Arrays.sort(strings);

		String[] answer = new String[strings.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = strings[i].substring(1);
		}

		return answer;
	}
}
