package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinimumDistances {

	public static int minimumDistances(List<Integer> a) {
		int b[] = new int[10000000];
		for (Integer d : a) {
			b[d]++;
		}
		int res = a.size();
		for (int i = 0; i < 10000000; i++) {
			if (b[i] >= 2) {
				int pos = a.indexOf(i);
				System.out.println(i+"\t"+pos);
				int pos2 = 0;
				int dem = 0;
				for (Integer x : a) {
					if (x == i && pos != dem) {
						pos2 = dem;
						break;
					}
					dem++;
				}
				if(pos2 != 0 && pos2 - pos  < res) res = pos2 - pos; 
			}
		}
		
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		int res = minimumDistances(a);
		if (res != a.size())
			System.out.println(res);
		else
			System.out.println("-1");
	}
}
