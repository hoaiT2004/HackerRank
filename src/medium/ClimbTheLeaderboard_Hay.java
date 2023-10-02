package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ClimbTheLeaderboard_Hay {
	   public static int bs(List<Integer> arr, int x)
	    {
	        int l = 0, h = arr.size() - 1;
	        while(l <= h)
	        {
	            int mid = l + (h - l) / 2;
	            if(arr.get(mid) == x)
	                return mid;
	            else if(arr.get(mid) > x)
	                l = mid + 1;
	            else
	                h = mid - 1;
	        }
	        return h;
	    }

	    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
	        List<Integer> list = new ArrayList<>(new HashSet<>(ranked));  ////////////////// Thêm những phần tử distinct vào list
	        Collections.sort(list, Comparator.reverseOrder());////////////////////// Sắp xếp giảm dần
	        List<Integer> res = new ArrayList<>();
	        // int rankSize = set.size();
	        
	        for(int p : player)
	        {
	            int val = bs(list, p);
	            res.add(val + 1);
	        }
	        return res;
	    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		List<Integer> ranked = new ArrayList<Integer>();
		List<Integer> player = new ArrayList<Integer>();
		for (int i = 0; i < m; i++) {
			int val = sc.nextInt();
			ranked.add(val);
		}
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int val = sc.nextInt();
			player.add(val);
		}
		List<Integer> res = climbingLeaderboard(ranked, player);
		for (Integer integer : res) {
			System.out.println(integer);
		}
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           