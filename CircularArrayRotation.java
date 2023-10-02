package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CircularArrayRotation {

	public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
		List<Integer> res = new ArrayList<Integer>();
		while (k != 0) {
			int val = a.get(a.size() - 1);
			a.remove(a.size() - 1);
			a.add(0, val);
			k--;
		}
		for (Integer integer : queries) {
			res.add(a.get(integer));
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> queries = new ArrayList<Integer>();
		int n = sc.nextInt(),k = sc.nextInt(),q = sc.nextInt();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		while(q !=0) {
			queries.add(sc.nextInt());
			q--;
		}
		List<Integer> res = circularArrayRotation(a, k, queries);
		for (Integer integer : res) {
			System.out.println(integer);
		}
	}
}
