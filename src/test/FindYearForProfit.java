package test;

import java.util.Scanner;

public class FindYearForProfit {

	/*Ann put M money in the bank. The bank increases Ann's deposit by P percent every year. 
	 * Ann wants to know how many years should pass until her deposit in the bank reaches K money. 
	 * Can you help her to answer this question?

	The input contains three integers M, P, K. It is guaranteed that all numbers are positive and K≥M.
	Output the answer to Ann's question.*/

	public static void main(String[] args) {
		@SuppressWarnings({ "resource" })
		Scanner scanner = new Scanner(System.in);

		double M = scanner.nextInt();
		double P = scanner.nextInt();
		double K = scanner.nextInt();
		int year = 0;
		
		do	 {
			M=(M*P/100)+M;
			year++;
			
		} while (M<K);
		System.out.println(M);
		System.out.println(year);
		
		
	}	
	
}
