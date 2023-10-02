package easy;

import java.util.Scanner;

public class CountingValleys_Hay {
	public static int countingValleys(int steps, String path) {
		int dem = 0;
		int vt = 0;
		for (int i = 0; i < path.length(); i++) {
			if (path.charAt(i) == 'D')
				vt--;
			else vt++;
			if (vt == 0 && path.charAt(i) == 'U')
				dem++;
		}
		return dem;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int result = countingValleys(n, s);
	}
}
