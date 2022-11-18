package algorithm_study.문자열을정수로바꾸기;

public class Solution {

	public int solution(String s) {
		boolean isMinus = false;
		if (s.contains("-")) {
			s = s.replace("-", "");
			isMinus = true;
		}
		int answer = Integer.parseInt(s);

		return isMinus ? answer * -1 : answer;
	}
}
