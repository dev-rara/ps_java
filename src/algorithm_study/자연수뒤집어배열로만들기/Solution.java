package algorithm_study.자연수뒤집어배열로만들기;

public class Solution {
	public int[] solution(long n) {
		String str = String.valueOf(n);
		int len = str.length();
		int[] answer = new int[len];

		for (int i = 0; i < str.length(); i++) {
			String temp = String.valueOf(str.charAt(len - 1 - i));
			answer[i] = Integer.parseInt(temp);
		}
		return answer;
	}

}
