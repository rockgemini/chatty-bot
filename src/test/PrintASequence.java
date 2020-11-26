package test;

import java.util.Scanner;

/*Write a program that prints a part of the sequence 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... 
 * (the number is repeated as many times, to what it equals to). The input to the program is a positive integer n: the number 
 * of the elements of the sequence the program should print. Output the sequence of numbers, written in a single line, 
 * space-separated.

For example, if n = 7, then the program should output 1 2 2 3 3 3 4.*/
public class PrintASequence {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int count = 0;

		for (int i = 0; i <= n; i++) { // This will loop n times

			for (int j = 0; j < i && count<n; j++) { //This will loop i times
				System.out.print(i + " ");
				count++;
						

			} //System.out.println("Count is "+count);

		}

		
	}

}
