package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AcmIcpcTeam {
	public static List<Integer> acmTeam(List<String> topic) {
		List<Integer> res = new ArrayList<Integer>();
		Map<String, Integer> myMap = new HashMap<String, Integer>();
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < topic.size() - 1; i++) {
			for (int j = i + 1; j < topic.size(); j++) {
				int pos = 0,dem = 0;
				while (pos != topic.get(0).length()) {
					if (topic.get(i).charAt(pos) == '1' || topic.get(j).charAt(pos) == '1')
						dem++;
					pos++;
					if (dem > max)
						max = dem;
					myMap.put(i+""+j, dem);
				}
			}
		}
		int countPersonKnow = 0;
		for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
			if(entry.getValue() == max) countPersonKnow++;
		}
		res.add(max);
		res.add(countPersonKnow);
		return res;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> topic = new ArrayList<>();
		int n = sc.nextInt();
		// int m = sc.nextInt();
		for (int i = 0; i < n; i++) {
			topic.add(sc.next());
		}

		List<Integer> res = acmTeam(topic);
		for (Integer integer : res) {
			System.out.println(integer);
		}

	}
}
