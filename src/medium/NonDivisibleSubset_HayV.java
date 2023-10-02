package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonDivisibleSubset_HayV {
	public static int nonDivisibleSubset(int k, List<Integer> s) {
		// Write your code here
		 int[] count=new int[k];
	        for(Integer e:s){
	            count[e%k]++;
	        }
	        int resp=Math.min(count[0],1);
	        if(k%2==0) resp+=Math.min(count[k/2],1);
	        for (int i=1;i<k/2+1;i++){
	            if(i==k-i)continue;
	            resp+=Math.max(count[i],count[k-i]);
	        }
	        return resp;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), k = sc.nextInt();
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt());
		}
		int res = nonDivisibleSubset(k, list);
		System.out.println(res);
	}
}
