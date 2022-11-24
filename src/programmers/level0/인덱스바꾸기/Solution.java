package programmers.level0.인덱스바꾸기;

import java.util.Arrays;

public class Solution {

	public String solution(String my_string, int num1, int num2) {
		char[] chars = my_string.toCharArray();

		for (int i = 0; i < chars.length; i++) {
			for (int j = 0; j < chars.length; j++) {
				if (i == num1 && j == num2) {
					char temp = chars[i];
					chars[i] = chars[j];
					chars[j] = temp;
				}
			}
		}

		return String.valueOf(chars);
	}
}
