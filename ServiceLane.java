package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceLane {
	public static List<Integer> serviceLane(int n, List<List<Integer>> cases, List<Integer> widths) {
		List<Integer> res = new ArrayList<Integer>();
		for (List<Integer> cas : cases) {
			int min = 3;
			int beginPos = cas.get(0);
			int lastPos = cas.get(1);
			while (beginPos != lastPos + 1) {
				if (min > widths.get(beginPos))
					min = widths.get(beginPos);
				beginPos++;
			}
			res.add(min);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), t = sc.nextInt();
		List<Integer> widths = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			widths.add(sc.nextInt());
		}
		List<List<Integer>> cases = new ArrayList<List<Integer>>();
		for (int i = 0; i < t; i++) {
			List<Integer> cas = new ArrayList<>();
			cas.add(sc.nextInt());
			cas.add(sc.nextInt());
			cases.add(cas);
		}
		List<Integer> res = serviceLane(n, cases, widths);
		for (Integer integer : res) {
			System.out.println(integer);
		}

	}
}
