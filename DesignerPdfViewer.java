package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DesignerPdfViewer {

	public static int designerPdfViewer(List<Integer> h, String word) {
		int res = 0;
		for (int i = 0; i < word.length(); i++) {
			int number = word.charAt(i);
			int dem = h.get(number - 97);
			if (res < dem)
				res = dem;
		}
		return res * word.length();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> h = new ArrayList<Integer>();
		int n = 'a'; // 97
		int m = 'z'; // 122
		for (int i = 0; i <= 25; i++) {
			int val = sc.nextInt();
			h.add(val);
		}
		String word = sc.next();
		int result = designerPdfViewer(h, word);
		System.out.println(result);
	}
}
