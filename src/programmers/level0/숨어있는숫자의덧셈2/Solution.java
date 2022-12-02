package programmers.level0.숨어있는숫자의덧셈2;

import java.util.ArrayList;

public class Solution {

	public int solution(String my_string) {
		my_string = my_string.replaceAll("[^0-9]", ",");
		String[] arr = my_string.split(",");
		int answer = 0;

		for (String str: arr) {
			if (!str.equals("")) {
				answer += Integer.parseInt(str);
			}
		}
		return answer;
	}
}
