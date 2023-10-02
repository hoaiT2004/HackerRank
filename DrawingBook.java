package easy;

import java.util.Scanner;

//Condition:1 <= p <= n
public class DrawingBook {
	public static int pageCount(int n, int p) {
		if ((p == 1) || (p == n) || (n % 2 != 0 && p == n - 1))
			return 0;
		int min = 100000;

		int begin = 1;
		int countBegin = 0;
		while (true) {
			begin += 2;
			countBegin++;
			if (begin >= p)
				break;
		}
		if (min > countBegin)
			min = countBegin;

		int countLast = 0;
		int copy = n;
			while (true) {
				n -= 2;
				countLast++;
				if ((copy%2 == 0&&n <= p)||(copy%2!=0&&n == p ||copy%2!=0&& (n - 1) == p))
					break;
			}

		if (min > countLast)
			min = countLast;

		return min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), p = sc.nextInt();
		int result = pageCount(n, p);
		System.out.println(result);
	}
}
