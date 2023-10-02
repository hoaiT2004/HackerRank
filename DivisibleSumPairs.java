package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DivisibleSumPairs {
	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		int a[] = new int[ar.size()];
		int x = 0;
		for (Integer val : ar) {
			a[x] = val;
			x++;
		}
		int res = 0;
		for (int i = 0; i < a.length - 1; i++) {
			int dem = a[i];
			for (int j = i + 1; j < a.length; j++) {
				int val = a[j];
				if ((dem + val) % k == 0)
					res++;
			}
		}
		return res;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		List<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			ar.add(val);
		}
		int result = divisibleSumPairs(n, k, ar);
		System.out.println(result);

	}
}
