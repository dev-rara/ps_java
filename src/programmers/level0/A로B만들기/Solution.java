package programmers.level0.A로B만들기;

public class Solution {

	public int solution(String before, String after) {
		int beforeCnt = 0;
		int afterCnt = 0;

		for (int i = 0; i < before.length(); i++) {
			beforeCnt += before.charAt(i);
			afterCnt += after.charAt(i);
		}
		return beforeCnt == afterCnt ? 1 : 0;
	}
}
