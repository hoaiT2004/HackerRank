package easy;

import java.util.Scanner;

public class StrangeAdvertising {
	public static int viralAdvertising(int n) {
		int begin = 5;
		int res = 0;
		for(int i = 1;i <= n;i++) {
			begin = begin/2;
			res +=  begin;
			begin = begin *3;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = viralAdvertising(sc.nextInt());
		System.out.println(res);
	}
}
