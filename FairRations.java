package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FairRations {

	public static String fairRations(List<Integer> B) {
		// Write your code here
		var index = 0;
		var count = 0;
		while (index != B.size()) {
			if(index == B.size()-1 && B.get(index) % 2 != 0) return "NO";
			if (B.get(index) % 2 != 0) {
				B.set(index, B.get(index) + 1);
				B.set(index+1, B.get(index+1)+1);
				count+=2;
			}
				index++;
		}
		return count+"";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		var n = sc.nextInt();
		List<Integer> B = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			B.add(sc.nextInt());
		}
		String res = fairRations(B);
		System.out.println(res);
	}
}
