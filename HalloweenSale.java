package easy;

import java.util.Scanner;

public class HalloweenSale {
	public static int howManyGames(int p, int d, int m, int s) {
		var dem = 0;
		while (s >= m) {
			if(s < p) return dem;
			if (dem == 0) { 
				s -= p;
			}else {
				if (p-d < m) {
					s -= m;
				}else {
					s -= (p - d);
					p = p-d;
				}
			}
			dem++;
		}
		return dem;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = howManyGames(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println(res);
	}
}
