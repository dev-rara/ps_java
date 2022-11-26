package programmers.level0.모스부호1;

public class Solution {

	public String solution(String letter) {
		StringBuilder answer = new StringBuilder();
		String[] str = letter.split(" ");
		String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
			"-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-",
			".--", "-..-", "-.--", "--.."};

		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < morse.length; j++) {
				if (str[i].equals(morse[j])) {
					answer.append((char) ('a' + j));
				}
			}
		}
		return answer.toString();
	}
}
