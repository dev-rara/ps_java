package algorithm_study.문자열내p와y의개수;

public class Solution {

	boolean solution(String s) {
		int pCnt = 0;
		int yCnt = 0;

		for (int i = 0; i < s.length(); i++) {
			char str = s.charAt(i);

			if (String.valueOf(str).equalsIgnoreCase("p")) {
				pCnt++;
			} else if (String.valueOf(str).equalsIgnoreCase("y")) {
				yCnt++;
			}
		}

		return pCnt == yCnt;
	}
}
