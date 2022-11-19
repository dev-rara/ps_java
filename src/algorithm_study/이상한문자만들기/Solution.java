package algorithm_study.이상한문자만들기;

public class Solution {

	public String solution(String s) {
		String[] strArray = s.split("");
		StringBuilder answer = new StringBuilder();
		int idx = 0;

		for (int i = 0; i < strArray.length; i++) {
			if(strArray[i].equals(" ")) {
				idx = 0;
			} else if(idx % 2 == 0) {
				strArray[i] = strArray[i].toUpperCase();
				idx++;
			} else {
				strArray[i] = strArray[i].toLowerCase();
				idx++;
			}
			answer.append(strArray[i]);
		}
		return answer.toString();
	}
}
