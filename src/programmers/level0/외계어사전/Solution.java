package programmers.level0.외계어사전;

import java.util.Arrays;

public class Solution {

	public int solution(String[] spell, String[] dic) {
		int answer = 2;

		Arrays.sort(spell);
		String str = Arrays.toString(spell);

		for (int i = 0; i < dic.length; i++) {
			char[] arr = dic[i].toCharArray();
			Arrays.sort(arr);
			dic[i] = Arrays.toString(arr);
		}

		for (String s : dic) {
			if (str.equals(s)) {
				answer = 1;
				break;
			}
		}
		return answer;
	}
}
