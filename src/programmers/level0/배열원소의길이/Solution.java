package programmers.level0.배열원소의길이;

public class Solution {

	public int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length];

		for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}

		return answer;
	}
}
