package easy;

import java.util.Scanner;

public class ElectronicsShop {

	static int getMoneySpent(int[] keyboards, int[] drives, int b) {
		int max = 0;
		for (int i = 0; i < keyboards.length; i++) {
			int sum = keyboards[i];
			for (int j = 0; j < drives.length; j++) {
				int sum2 = drives[j];
				if ((sum + sum2) <= b && (sum + sum2) > max)
					max = (sum + sum2);
			}
		}
		if (max == 0)
			return -1;
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt(), n = sc.nextInt(), m = sc.nextInt();
		int keyboards[] = new int[n], drives[] = new int[m];
		for (int i = 0; i < keyboards.length; i++) {
			keyboards[i] = sc.nextInt();
		}
		for (int i = 0; i < drives.length; i++) {
			drives[i] = sc.nextInt();
		}
		int result = getMoneySpent(keyboards, drives, b);
System.out.println(result);
	}
}
