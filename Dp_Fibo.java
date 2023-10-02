package easy;

import java.util.Scanner;

public class Dp_Fibo {
	static int fibo[];
public static int fb(int n) {
	if(n < 2) return 1;
	if(fibo[n] != 0) return fibo[n];
	else fibo[n] = fb(n-1)+fb(n-2);
	System.out.println(fibo[n]);
	return fibo[n];
}
public static int dequy(int n) {
	if(n < 2) return 1;
	return dequy(n-1)+dequy(n-2);
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fibo = new int[100];
		Long t1 = System.currentTimeMillis();				
		System.out.println(fb(n));
		Long t2 = System.currentTimeMillis();
		Long t3 = System.currentTimeMillis();
		System.out.println(dequy(n));
		Long t4 = System.currentTimeMillis();
		System.out.println("t1="+t1+"\tt2="+t2+"\t"+(t2-t1));
		System.out.println("t3="+t3+"\tt4="+t4+"\t"+(t4-t3));
	}
}
