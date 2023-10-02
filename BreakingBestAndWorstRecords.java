package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BreakingBestAndWorstRecords {
	public static List<Integer> breakingRecords(List<Integer> scores) {
		List<Integer> res = new ArrayList<Integer>();
		int countBreakWorst = 0;
		int countBreakBest = 0;
		int min = 190000000;
		int max = -1;
		for (Integer integer : scores) {
			if (integer > max) {
				countBreakBest++;
				max = integer;
			}
			if (integer < min) {
				min = integer;
				countBreakWorst++;
			}
		}
		res.add(countBreakBest - 1);
		res.add(countBreakWorst - 1);
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> scores = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			scores.add(val);
		}
		List<Integer> result = breakingRecords(scores);
		for (Integer integer : result) {
			System.out.print(integer + " ");
		}
	}
}
