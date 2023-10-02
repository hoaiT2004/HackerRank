package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationEquation {
	public static List<Integer> permutationEquation(List<Integer> p) {
		int x = 1;
		List<Integer> res = new ArrayList<Integer>();
		while (x != p.size() + 1) {
			res.add(p.indexOf(p.indexOf(x) + 1) + 1);
			x++;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> p = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			p.add(sc.nextInt());
		}
		List<Integer> res = permutationEquation(p);
		for (Integer integer : res) {
			System.out.println(integer);
		}
	}
}
