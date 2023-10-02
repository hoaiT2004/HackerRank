package easy;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {
	static int jumpingOnClouds(int[] c, int k) {
		int point = 100;
		int i = 0;
		while(true) {
			if (c[i%c.length] == 1 && i > 0) {
				point -= 3;
			}else if(c[i%c.length] == 0 && i > 0)
				point--;
			i+=k;
			if(i%c.length == 0) break;
		}	
		if(c[0] == 0) point--;
		else point -= 3;
		return point;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		int res = jumpingOnClouds(a, k);
		System.out.println(res);
		// condition n%k=0
	}
}
