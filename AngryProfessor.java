package easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngryProfessor {

    public static String angryProfessor(int k, List<Integer> a) {
    // Write your code here
    	int dem = 0;
    	for (Integer integer : a) {
			if(integer <= 0) dem++;
		}
    	if(dem >= k)
    	return "NO";
    	return "YES";
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0) {
			int n = sc.nextInt(),k = sc.nextInt();
			List<Integer> a = new ArrayList<Integer>();
			for (int i = 0; i < n; i++) {
				int val = sc.nextInt();
				a.add(val);
			}
			String res = angryProfessor(k, a);
			System.out.println(res);
			t--;
		}
	}
}
