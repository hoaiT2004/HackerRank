package easy;

import java.util.Scanner;

public class SaveThePrisoner {
	public static int saveThePrisoner(int n, int m, int s) {
		// Write your code here
		m = m%n;
		m--;
		while (m!=0) {
			s++;
			m--;
		}
		if(s % n == 0) return n;
		return s%n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int n = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt();
			int res = saveThePrisoner(n, m, s);
			System.out.println(res);
			t--;
		}
	}
}
