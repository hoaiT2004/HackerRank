package easy;

import java.util.Scanner;

public class AppendAndDelete {
	public static String appendAndDelete(String s, String t, int k) {
		if (s.equals(t))
			return "Yes";
		else {
			int dem = 0;
			int pos = s.length() - 1;
			while (true) {
				if (s.equals(t) && dem <= k) {
					return "Yes";
				} else if (t.indexOf(s) == 0) {
					if (((t.length() - s.length() + dem) == k)
							|| ((t.length() - s.length() + dem) < k && (t.length() - s.length() + dem) % 2 == 0))
						return "Yes";
					return "No";
				} else {
					s = s.substring(0, pos);
					dem++;
					pos--;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next(), t = sc.next();
		int k = sc.nextInt();
		String res = appendAndDelete(s, t, k);
		System.out.println(res);
	}
}
