package easy;

import java.util.Scanner;

public class SherlockAndSquares_Hay {
	public static int squares(int a, int b) {
	    int squares = 0;
	    double firstSquareRoot = 0;
	 
	    //Find the first square root
	    for(int value = a; value <= b; value++) {
	        double squareRoot = Math.sqrt(value);
	        if(squareRoot == Math.round(squareRoot)) {//Math.round:Làm tròn
	            firstSquareRoot = squareRoot;
	            break;
	        }
	    }
	 
	    //If the given boundary has atleast a square
	    if(firstSquareRoot != 0) {
	        double root = firstSquareRoot;
	 
	        //Count the number of squares in boundary
	        //that starts from first square root
	        while(root * root <= b) {
	            root++;
	            squares++;
	        }
	    }
	 
	    return squares;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res = squares(sc.nextInt(), sc.nextInt());
		System.out.println(res);
	}
}
