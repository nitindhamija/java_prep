package java_prep;

import java.util.Scanner;

public class CalFactorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("please enter a no to calculate factorial");
		Scanner s= new Scanner(System.in);
		long fact=calculateFactorial(s.nextInt());
		System.out.println(fact);
	}
	private static long calculateFactorial(long n) {
	     long fact=0;
	     if(n== 1)
	    	 return 1;
	     else
	    return fact=n*calculateFactorial(n-1);
		
		
	}
}
