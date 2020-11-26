package test;

import java.util.Scanner;
/*Given a sequence of natural numbers. For each number of the sequence output "even" if the number is even, otherwise, "odd". 
 * If the number is equal to 0, the program must stop reading and processing numbers.

Input data

A sequence of natural numbers, each number in a new line.

Output data

The sequence of words "even" and "odd". Each word in a new line.

Output the result right after the number is entered. Then input the next one. There's no need to store the sequence.*/
public class TestBreak {

	public static void main(String[] args) {
		@SuppressWarnings({ "unused", "resource" })
		Scanner scanner = new Scanner(System.in);
		
		
		while (true) {
			int i = scanner.nextInt();
			if (i%2==0 && i!=0) {
				System.out.println("even");
			} else if (i%2!=0 && i!=0) {
				System.out.println("odd");
			} else {
				break;
			}
			
		}
	}

}
