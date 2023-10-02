package easy;

import java.util.Scanner;

public class TaumAndBday {
	public static long taumBday(int b, int w, int bc, int wc, int z) {
		if (bc > wc + z)
			return (long)b * (wc + z) +(long) w * wc;
		if (wc > bc + z)
			return (long)b * bc + (long)w * (bc + z);
		return (long)b * bc + (long)w * wc;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			long res = taumBday(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
			System.out.println(res);
			t--;
		}
	}
}
