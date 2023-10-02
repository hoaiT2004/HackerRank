package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MagicSquareForming {
	public static int formingMagicSquare(List<List<Integer>> s) {
		int res = Integer.MAX_VALUE;
		int[][][] magicSquares = { { { 8, 1, 6 }, { 3, 5, 7 }, { 4, 9, 2 } }, { { 6, 1, 8 }, { 7, 5, 3 }, { 2, 9, 4 } },
				{ { 4, 9, 2 }, { 3, 5, 7 }, { 8, 1, 6 } }, { { 2, 9, 4 }, { 7, 5, 3 }, { 6, 1, 8 } },
				{ { 8, 3, 4 }, { 1, 5, 9 }, { 6, 7, 2 } }, { { 4, 3, 8 }, { 9, 5, 1 }, { 2, 7, 6 } },
				{ { 6, 7, 2 }, { 1, 5, 9 }, { 8, 3, 4 } }, { { 2, 7, 6 }, { 9, 5, 1 }, { 4, 3, 8 } } };
		int i = 0;
		int a[][] = new int[3][3];
		for (List<Integer> li : s) {
			int j = 0;
			for (Integer li2 : li) {
				a[i][j] = li2;
				j++;	
			}
			i++;
		}
		for (int[][] is : magicSquares) {
			int sum = 0;
			for (int j = 0; j < 3; j++) {
				for (int k = 0; k < 3; k++) {
					sum += Math.abs(a[j][k] - is[j][k]);
				}
			}
			if(sum < res) res = sum;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<List<Integer>> check = new ArrayList<List<Integer>>();
		for (int i = 0; i < 3; i++) {
			List<Integer> sample = new ArrayList<Integer>();
			for (int j = 0; j < 3; j++) {
				int val = sc.nextInt();
				sample.add(val);
			}
			check.add(sample);
		}
		int val = formingMagicSquare(check);
		System.out.println(val);
	}
}
