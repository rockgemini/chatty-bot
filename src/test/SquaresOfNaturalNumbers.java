package test;

import java.util.Scanner;

public class SquaresOfNaturalNumbers {

	public static void main(String[] args) {
	/*Read an integer number N from the input and print all the squares of natural numbers:

	A. less than or equal to N,
	B. in ascending order.*/
		
	@SuppressWarnings("resource")
	Scanner scanner = new Scanner(System.in);
			int N = scanner.nextInt();
			int i = 1;
			
			int sq;
			do {
				sq = i*i;
				i++;
				if(sq<=N)
					System.out.println(sq);
			} while(sq<=N);
			
			
		
	}

}
