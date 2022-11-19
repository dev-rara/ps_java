package algorithm_study.정수내림차순으로배치하기;

import java.util.Arrays;

public class Solution {

	public long solution(long n) {
		String str = String.valueOf(n);
		int len = str.length();
		char[] charArray = new char[len];

		for (int i = 0; i < len; i++) {
			charArray[i] = str.charAt(i);
		}
		Arrays.sort(charArray);

		char[] temp = new char[len];
		for (int i = 0; i < len; i++) {
			temp[i] = charArray[len - 1 - i];
		}
		str = String.valueOf(temp);

		return Long.parseLong(str);
	}
}
