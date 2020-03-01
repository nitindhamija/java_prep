package problem.solving;

import java.util.Scanner;

public class ReduceToZeroMinSteps {

	public static void main(String[] args) {

		System.out.println("please enter a no to calculate min steps to make it 0");
		Scanner s= new Scanner(System.in);

		System.out.println(reduceToZero(s.nextInt()));

	}

	public static int reduceToZero(int n) {
		if (n == 0)
			return 0;
			for(int d=n/2;d>1;d--)
			{ int rem=n%d;
			
			if(rem==0 && findLargestPrimeDivisor(d)) {
				System.out.println("division is "+d);
			return 1+reduceToZero(n/d);		
			}
			}
			System.out.println("reduction by 1");
			return 1+reduceToZero(n-1);

}

	public static boolean findLargestPrimeDivisor(int d) {
		for (int k = d / 2; k > 1; k--)
			if (d % k == 0)
				return false;
		return true;
	}
}