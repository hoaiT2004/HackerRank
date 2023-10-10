package easy;

import java.util.Scanner;

public class FlatlandSpaceStations {
	static int flatlandSpaceStations(int n, int[] c) {
		if (n == c.length)
			return 0;

		int arr[] = new int[2000000];
		for (int i : c) {
			arr[i] = 1;
		}
		int max = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0) {
				int nearDistance = 100000, nearDistance2 = 100000, max1 = 0, max2 = 0;
				for (int j = i + 1; j < n; j++)
					if (arr[j] == 1) {
						if (Math.abs(j - i) > max)
							max1 = Math.abs(j - i);
						nearDistance = j - i;
						break;
					}

				for (int j = i - 1; j >= 0; j--)
					if (arr[j] == 1) {
						if (Math.abs(j - i) > max)
							max2 = Math.abs(j - i);
						nearDistance2 = i - j;
						break;
					}
				if (nearDistance < nearDistance2) {
					if (max1 > max)
						max = max1;
				} else {
					if (max2 > max)
						max = max2;
				}

			}
		}
		return max;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var n = sc.nextInt();
		var spaceStation = sc.nextInt();
		var c = new int[spaceStation];
		for (int i = 0; i < c.length; i++) {
			c[i] = sc.nextInt();
		}
		int res = flatlandSpaceStations(n, c);
		System.out.println(res);
	}
}
