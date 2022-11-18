package algorithm_study.완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

public class Solution {

	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap();

		for (String player : participant) {
			map.put(player, map.getOrDefault(player, 0) + 1);
		}

		for (String player : completion) {
			map.put(player, map.get(player) - 1);
		}

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() != 0) {
				answer = entry.getKey();
			}
		}

		return answer;
	}
}
