package programmers.level0.크기가작은부분문자열;

public class Solution {
	public int solution(String t, String p) {
		int answer = 0;

		String[] arr = t.split("");
		for (int i = 0; i <= t.length() - p.length(); i++) {
			StringBuilder str = new StringBuilder(arr[i]);

			for (int j = i + 1; j < i + p.length(); j++) {
				str.append(arr[j]);
			}

			if (Long.parseLong(str.toString()) <= Long.parseLong(p)) {
				answer++;
			}
		}
		return answer;
	}
}
