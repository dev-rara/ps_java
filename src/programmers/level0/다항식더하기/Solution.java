package programmers.level0.다항식더하기;

public class Solution {
	public String solution(String polynomial) {
		String answer = "";
		int xCnt = 0;
		int cnt = 0;

		for (String str : polynomial.split(" ")) {
			if (str.contains("x")) {
				xCnt += str.equals("x") ? 1: Integer.parseInt(str.replaceAll("x", ""));
			} else if (!str.equals("+")) {
				cnt += Integer.parseInt(str);
			}
		}

		String cntStr = cnt > 0? String.valueOf(cnt) : "";
		String xCntStr = xCnt > 0? xCnt == 1 ? "x" : xCnt + "x" : "";
		if (xCnt > 0) {
			if (cnt > 0) {
				answer += xCntStr + " + " + cntStr;
			} else {
				answer += xCntStr;
			}
		} else if (cnt > 0) {
			answer += cntStr;
		}

		return answer;
	}
}
