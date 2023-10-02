package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MigratoryBirds {
	public static int migratoryBirds(List<Integer> arr) {
		int a[] = new int[1000000];
		for (Integer i : arr) {
			a[i]++;
		}
		int max = 0;
		for (int i = 0; i < 1000000; i++) {
			if(max < a[i])max = a[i];
		}
		int res = 0;
		for (int i = 0; i < 1000000; i++) {
			if (max == a[i]) {
				res = i;
				break;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> ar = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			ar.add(val);
		}
		int result = migratoryBirds(ar);
		System.out.println(result);
	}
}
