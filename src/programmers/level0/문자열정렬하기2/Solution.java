package programmers.level0.문자열정렬하기2;

import java.util.Arrays;

public class Solution {

	public String solution(String my_string) {
		char[] answer = my_string.toLowerCase().toCharArray();
		Arrays.sort(answer);
		return String.valueOf(answer);
	}
}
