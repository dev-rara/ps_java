package programmers.level0.컨트롤제트;

public class Solution {
	public int solution(String s) {
		String[] str = s.split(" ");

		int answer = Integer.parseInt(str[0]);
		for (int i = 1; i < str.length; i++) {
			if (str[i].equals("Z")) {
				answer -= Integer.parseInt(str[i - 1]);
			} else {
				answer += Integer.parseInt(str[i]);
			}
		}
		return answer;
	}
}
