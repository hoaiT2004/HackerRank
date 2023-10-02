package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BetweenTwoSets {
	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int maxa = 0,minb = 100;
		int res = 0;
		for (Integer integer : a) {
			if(maxa < integer) maxa = integer;
		}
		for (Integer integer : b) {
			if(minb > integer) minb = integer;
		}
		if(maxa > minb) return 0;
		for(int i = maxa; i <= minb;i++) {
			int dem = 0;
			for (Integer integer : a) {
				if(i % integer != 0) {
					dem++;
					break;
				}
			}
			if(dem == 0) {
				int dem2 =0;
				for (Integer integer : b) {
					if(integer % i != 0) {
						dem2++;
						break;
					}
				}
				if(dem2==0) res++;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),m = sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		List<Integer> brr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			arr.add(val);
		}
		for (int i = 0; i < m; i++) {
			int val = sc.nextInt();
			brr.add(val);
		}
		int total = getTotalX(arr, brr);
		System.out.println(total);
	}
}
