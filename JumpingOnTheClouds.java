package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JumpingOnTheClouds {
	public static int jumpingOnClouds(List<Integer> c) {
		// Write your code here
		int countJump = 0;
		int index = 0;
		while (index != c.size() - 1) {
			if (index <= c.size() - 3 && c.get(index + 2) == 0) {
				countJump++;
				index = index + 2;
			} else if (index < c.size() - 1) {
				countJump++;
				index++;
			}
		}

		return countJump;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> c = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			c.add(sc.nextInt());
		}
		int res = jumpingOnClouds(c);
		System.out.println(res);
	}
}
