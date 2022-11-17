package programmers.level0.문자열정렬하기;

import java.util.Arrays;

public class Solution {

	public int[] solution(String my_string) {
		my_string = my_string.replaceAll("[^0-9]", "");
		int[] answer = new int[my_string.length()];

		for (int i = 0; i < my_string.length(); i++) {
			answer[i] = Integer.parseInt(String.valueOf(my_string.charAt(i)));
		}
		Arrays.sort(answer);

		return answer;
	}

}
