package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EqualityInAArray {
	public static int equalizeArray(List<Integer> arr) {
		// Write your code here
		int a[] = new int[120];
		for (int i : arr) {
			a[i]++;
		}
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) max = a[i];
		}
		return arr.size() - max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		int res = equalizeArray(arr);
		System.out.println(res);
	}
}
