package easy;

import java.util.Scanner;

public class UtopianTree {

	public static int utopianTree(int n) {
		// Write your code here
		int res = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0)
				res = res * 2;
			else
				res++;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		while (k != 0) {
			int n = sc.nextInt();
			int res = utopianTree(n);
			System.out.println(res);
			k--;
		}
	}
}
