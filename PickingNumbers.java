package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PickingNumbers {

	public static int pickingNumbers(List<Integer> a) {
		int resFinish = 1;
		
		int ar[] = new int[a.size()];
		int pos = 0;
		for (Integer integer : a) {
			ar[pos] = integer;
			pos++;
		}
		
		Arrays.sort(ar);
		for (int i = 0; i < ar.length-1; i++) {
			int dem = 1;
			for (int j = i+1; j < ar.length; j++) {
				if(Math.abs(ar[j] - ar[i]) <= 1) 
					dem++;
				if(Math.abs(ar[j] - ar[i]) > 1 || j == ar.length-1) {
					if(dem > resFinish) resFinish = dem;
					i = j-1;
					break;
				}
			}
		}
		return resFinish;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			list.add(val);
		}
		int result = pickingNumbers(list);
		System.out.println(result);
	}
}
