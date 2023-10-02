package medium;

import java.util.Scanner;

public class Encryption {
	public static String encryption(String s) {
		int n = (int) Math.sqrt(s.length());
		int k = 0, right = 0;
		if (n * n == s.length()) {
			k = n;
			right = n;
		} else {
			k = (n * (n + 1) > s.length()) ? n : (n + 1);
			right = n + 1;
		}
		char ar[][] = new char[k][right];
		int x = 0, y = 0;
		for (int i = 0; i < s.length(); i++) {
			ar[x][y] = s.charAt(i);
			if (y == right-1) {
				x++;
				y = 0;
			} else
				y++;
		}
		String[] res = new String[right];
		for(int i =0;i < right;i++) res[i] = "";
		for (char[] strings : ar) {
			int pos = 0;
			for (char c : strings) {
				res[pos] += c;
				pos++;
			}
		}
		String resultLast = "";
		for (int i = 0; i < res.length; i++) {
			for (int j = 0; j < res[i].length(); j++) {
				if(res[i].charAt(j) != 0) resultLast+= res[i].charAt(j);
			}
			resultLast+=" ";
		}
		
		return resultLast;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String res = encryption(sc.next());
		System.out.println(res);
//		String res = "abc  ";
//		for (int i = 0; i < res.length(); i++) {
//			System.out.println(res.charAt(i));
//			boolean a = Character.isWhitespace(res.charAt(i));
//			System.out.println(a);
//		}
	}
}
