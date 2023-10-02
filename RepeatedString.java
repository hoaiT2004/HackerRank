package easy;

import java.util.Scanner;

public class RepeatedString {
	public static long repeatedString(String s, long n) {
		// Write your code here
		long dem = 0;
		long counta = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a')
				counta++;
		}
		if (counta == 0)
			return 0;
		if (n / s.length() > 1) {
			dem = n / s.length() * counta;
			long dem2 = n % s.length();
			if (dem2 != 0) {
				for (int i = 0; i < s.length(); i++) {
					dem2--;
					if (s.charAt(i) == 'a')
						dem++;
					if (dem2 == 0)
						return dem;
				}
			}
		} else {
			long dem2 = 0;
			for (int i = 0; i < s.length(); i++) {
				dem2++;
				if (s.charAt(i) == 'a')
					dem++;
				if (dem2 == n)
					return dem;
			}
		}
		return dem;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long n = sc.nextLong();
		long res = repeatedString(s, n);
		System.out.println(res);
	}
}
