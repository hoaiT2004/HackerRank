package easy;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
	public static int beautifulDays(int i, int j, int k) {
		int res = 0;
		for(int x = i; x <= j;x++) {
			String s = x + "";
			StringBuilder sb = new StringBuilder(s);
			int val = Integer.parseInt(sb.reverse()+"");
			if(Math.abs(val-x) % k == 0) res++;
		}
		return res;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(), j = sc.nextInt(), k = sc.nextInt();
		int res = beautifulDays(i, j, k);
		System.out.println(res);
	}
}
