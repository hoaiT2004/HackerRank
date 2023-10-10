package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LisaWorkbook {
	public static int workbook(int n, int k, List<Integer> arr) {
		int chapter = 1;
		int res = 0;
		for (Integer integer : arr) {
				int number = 1;
				int count = 1;
				int integerTrap = integer;
				while (integer != 0) {
					if (integer <= k) {
					
						boolean isExist = false;
						for (int i = number; i <= integerTrap; i++) {
							if (i == chapter)
								isExist = true;
						}
						if (isExist)
							res++;
						integer = 0;
						chapter++;
					} else {
						
						boolean isExist = false;
						for (int i = number; i <= k*count; i++) {
							if (i == chapter)
								isExist = true;
						}
						if (isExist)
							res++;
						chapter++;
						integer -= k;
						number += k;
						count++;
					}
				
				}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var n = sc.nextInt();
		var k = sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}
		int res = workbook(n, k, arr);
		System.out.println(res);
	}
}
