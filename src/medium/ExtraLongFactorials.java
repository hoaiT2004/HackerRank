package medium;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
	public static void extraLongFactorials(int n) {
		// Write your code here
		if (n == 1) {
			System.out.println(1);
		} else {
			BigInteger begin = new BigInteger(n + "");
			n--;
			while (n != 1) {
				BigInteger last = new BigInteger(n + "");
				begin = begin.multiply(last);
				n--;
			}
			System.out.println(begin);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		extraLongFactorials(sc.nextInt());
//		  BigInteger num1 = new BigInteger(100+"");
//		    BigInteger num2 = new BigInteger(9+"");
//
//		    // Cộng hai số
//		    num1.add(num2);
//		    System.out.println("Tổng của " + num1 + " và " + num2 + " là: " + num1);
	}
}
