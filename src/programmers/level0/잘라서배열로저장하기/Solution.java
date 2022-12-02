package programmers.level0.잘라서배열로저장하기;

public class Solution {

	public String[] solution(String my_str, int n) {
		int len = my_str.length();
		String[] answer = new String[len % n != 0 ? len / n + 1 : len / n];
		StringBuilder str = new StringBuilder(my_str);

		int idx = 0;
		for (int i = 0; i < answer.length; i++) {
			if (idx + n < my_str.length()) {
				answer[i] = str.substring(idx, idx + n);
				idx += n;
			} else {
				answer[i] = str.substring(idx);
			}
		}
		return answer;
	}
}
