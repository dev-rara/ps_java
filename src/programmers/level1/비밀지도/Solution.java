package programmers.level1.비밀지도;

public class Solution {
	public String[] solution(int n, int[] arr1, int[] arr2) {
		String[] answer = new String[n];
		String result;

		for (int i = 0; i < n; i++) {
			result = String.format("%16s", Integer.toBinaryString(arr1[i] | arr2[i]));
			result = result.substring(result.length() - n);
			result = result.replaceAll("1", "#");
			result = result.replaceAll("0", " ");
			answer[i] = result;
		}
		return answer;
	}
}
