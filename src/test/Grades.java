package test;

import java.util.Scanner;

public class Grades {

	/* 	Problem: Find the number of D, C, B and A grades for the last test on informatics, where n students from a class have successfully passed the test.
	In this task, we use a 5-point grading system and are interested only in passing grades: from 2 to 5. They correspond to the letter grades in the following way: 5 is for A, 4 is for B, 3 is for C and 2 is for D. The program gets number n as input and then gets the grades themselves: one by one.
	The program should output four numbers in a single line: the number of D, C, B, and A grades respectively.*/

	public static void main(String[] args) {
		
		int A = 0;
		int B = 0;
		int C = 0;
		int D = 0;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int numberofStudents = scanner.nextInt();
		for (int i=1; i<=numberofStudents; i++) {
			int grade = scanner.nextInt();
			if(grade == 2) {
				D++;
			} else if (grade == 3) {
				C++;
			} else if (grade == 4) {
				B++;
			} else if (grade == 5) {
				A++;
			}
			
		}
		System.out.println(D + " " + C + " " + B + " " + A);

	}

}
