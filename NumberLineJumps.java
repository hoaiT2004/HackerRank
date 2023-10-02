package easy;

import java.util.Scanner;

public class NumberLineJumps {
	public static String kangaroo(int x1, int v1, int x2, int v2) {
		if(x2 == x1) {
			return "YES";
		}else if(v2 == v1) {
			return "NO";
		}else if((v2 > v1 && x2 > x1) || (v2 <v1 && x2 <x2)) return "NO";
			int minus = Math.abs(x2-x1);
			int dem = Math.abs(v1-v2);
			if(dem % minus ==0 || minus % dem ==0) return "YES";
			return "NO";
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt(),v1 = sc.nextInt(),x2 = sc.nextInt(),v2 = sc.nextInt();
		System.out.println(kangaroo(x1, v1, x2, v2));
	}
}
