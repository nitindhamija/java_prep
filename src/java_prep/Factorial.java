package java_prep;

import java.util.Scanner;

public class Factorial {

	
	public static void main() {
		
		int fact=calculateFactorial(5);
		
		
		
	}
	
	private static int calculateFactorial(int n) {
	     int fact=0;
	     if(n== 1)
	    	 return 1;
	     else
	    return fact=n*calculateFactorial(n-1);
		
		
	}
}
