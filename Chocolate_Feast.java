package easy;

import java.util.Scanner;

public class Chocolate_Feast {
	public static int chocolateFeast(int n, int c, int m) {
		int res = n/c;
		int wrap = res;
		if(wrap < m) return res;
		while(wrap >= m) {
			res += wrap/m;
			wrap = (wrap-m*(wrap/m))+wrap/m; 
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int res = chocolateFeast(sc.nextInt(), sc.nextInt(), sc.nextInt());
			System.out.println(res);
			t--;
		}
	}
}
