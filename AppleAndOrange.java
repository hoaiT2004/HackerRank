package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppleAndOrange {
	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
	    int count1 = 0,count2 = 0;
		for (Integer ap : apples) {
			int res= ap+a;
			if(res >= s && res <= t) count1++;
		}
		for (Integer or : oranges) {
			int res= or+b;
			if(res >= s && res <= t) count2++;
		}
		System.out.println(count1);
		System.out.println(count2);

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		 int t = sc.nextInt();
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int n = sc.nextInt(); 
		 int m = sc.nextInt();
		 List<Integer> apple = new ArrayList<Integer>();
		 for (int i = 0; i <n; i++) {
			int ap = sc.nextInt();
			apple.add(ap);
		}
		 List<Integer> orange = new ArrayList<Integer>();
		 for (int i = 0; i <m; i++) {
			int or = sc.nextInt();
			orange.add(or);
		}
		 countApplesAndOranges(s, t, a, b, apple, orange);
	}
}
