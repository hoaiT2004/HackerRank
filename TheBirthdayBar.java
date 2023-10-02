package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheBirthdayBar {
	public static int birthday(List<Integer> s, int d, int m) {
		if(s.size() < m) return 0;
		if(m == 1) {
			int count = 0;
			for (Integer integer : s) {
				if(integer == d) count++;
			}
			return count;
		}
		int a[] = new int[s.size()];
		int x = 0;
		for (Integer i : s) {
			a[x] =i;x++;
		}
		int res = 0;
		for(int i = 0;i < x-1;i++) {
			int limit = 1;
			int dem = a[i];
			for(int j = i+1;j < x;j++) {
				dem += a[j];
				limit++;
				if(limit == m && dem == d) res++;  
			}
		}
		return res;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> s = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			s.add(val);
		}
		int d = sc.nextInt(), m = sc.nextInt();
		
		int result = birthday(s, d, m);
		
		System.out.println(result);
	}
}
