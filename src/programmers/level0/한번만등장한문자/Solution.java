package programmers.level0.한번만등장한문자;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {

	public String solution(String s) {
		StringBuilder answer = new StringBuilder();
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}

		Map<Character, Integer> temp = new TreeMap<>(map);
		for (Map.Entry<Character, Integer> entry: temp.entrySet()) {
			if (entry.getValue() == 1) {
				answer.append(entry.getKey());
			}
		}
		return answer.length() == 0? "" : answer.toString();
	}
}
