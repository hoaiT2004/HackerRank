package easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TheHurdleRace {

    public static int hurdleRace(int k, List<Integer> height) {
    	Collections.sort(height,Comparator.reverseOrder());
    	if(k >= height.get(0)) return 0;
    	return height.get(0) - k;
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),k = sc.nextInt();
		List<Integer> height = new ArrayList<Integer>();
		for(int i = 0;i< n;i++) {
			int val = sc.nextInt();
			height.add(val);
		}
	}
}
