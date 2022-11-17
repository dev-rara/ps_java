package programmers.level0.모음제거;

public class Solution {

	public String solution(String my_string) {
		String answer = my_string;
		String[] alphabet = new String[]{"a", "e", "i", "o", "u"};

		for (int i = 0; i < alphabet.length; i++) {
			if (my_string.contains(alphabet[i])) {
				answer = answer.replace(alphabet[i], "");
			}
		}
		return answer;
	}

}
