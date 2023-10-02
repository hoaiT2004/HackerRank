package medium;

import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class KaprekarNumbers {

	    public static void kaprekarNumbers(int p, int q) {
	        boolean isRange = false;
	        for (int i = p; i <= q; i++) {
	            long mul = (long)i*i;
	            String size = String.valueOf(mul);
	            String left = size.substring(0,size.length()/2);
	             String right = size.substring(size.length()/2);
	 
	            long valleft = (left.isEmpty())?0:Long.valueOf(left);
	            long valRight = (right.isEmpty())?0:Long.valueOf(right);
	 //phải xét xâu rỗng nếu kh sẽ lỗi
	            if(Long.sum(valleft, valRight) == i){
	                isRange = true;
	                System.out.print(i+" ");
	            }
	        }
	        if(!isRange) System.out.println("INVALID RANGE");
	    }
	
	 
	    public static void main(String[] args) throws IOException {
	 Scanner sc = new Scanner(System.in);
	 int p = sc.nextInt(),q = sc.nextInt();
	        kaprekarNumbers(p, q);
	 
	 
	    }
	}

