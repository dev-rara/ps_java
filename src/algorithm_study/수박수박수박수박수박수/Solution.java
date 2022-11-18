package algorithm_study.수박수박수박수박수박수;

public class Solution {
	public String solution(int n) {
		String str1 = "수";
		String str2 = "박";
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				sb.append(str1);
			} else {
				sb.append(str2);
			}
		}
		return sb.toString();
	}
}
