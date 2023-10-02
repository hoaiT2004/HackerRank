package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grading_Student {

	public static List<Integer> gradingStudents(List<Integer> grades) {
		List<Integer> res = new ArrayList<Integer>();
		for (Integer integer : grades) {
			if (integer < 38 || integer % 5 == 0) {
				res.add(integer);
			} else {
				int n = integer;
				while (true) {
					n++;
					if (n % 5 == 0) {
						if (n - integer <= 2)
							res.add(n);
						else
							res.add(integer);
						break;
					}
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			int dem = sc.nextInt();
			res.add(dem);
		}
		List<Integer> kq = gradingStudents(res);
		for (Integer integer : kq) {
			System.out.println(integer);
		}
	}
}
