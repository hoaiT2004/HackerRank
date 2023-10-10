package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BeautifulTriplets {
	public static int beautifulTriplets(int d, List<Integer> arr) {
		int min = arr.get(0);
		int max = arr.get(arr.size()-1);
		int dem = 0;
		int pos = 0;
		while(min != max) {
			if(arr.contains(min) && arr.contains(min+d) && arr.contains(min+2*d)) dem++;
			pos++;
			min = arr.get(pos);
		}
		return dem;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), d = sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		int res = beautifulTriplets(d, arr);
		System.out.println(res);
	}
}
