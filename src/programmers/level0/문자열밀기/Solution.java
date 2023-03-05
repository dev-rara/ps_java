package programmers.level0.문자열밀기;

public class Solution {
	public int solution(String A, String B) {
		int answer = 0;

		String strA = A;
		for (int i = 0; i < A.length(); i++) {
			if (strA.equals(B)) {
				return answer;
			}

			String s = strA.substring(strA.length() - 1);
			strA = s + strA.substring(0, strA.length() - 1);
			answer++;
		}
		return -1;
	}
}
