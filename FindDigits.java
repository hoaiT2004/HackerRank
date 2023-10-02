package easy;

import java.util.Scanner;

public class FindDigits {
	public static int findDigits(int n) {
		// Write your code here
		int res = 0;
		int val = n;
		while (val != 0) {
			if ((val % 10) != 0 && n % (val % 10) == 0)
				res++;
			val = val / 10;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int n = sc.nextInt();
			int res = findDigits(n);
			System.out.println(res);
			t--;
		}
	}
}
