package test;

import java.util.Scanner;

public class SumOfElements {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int sum=0;
		int num;
		do {
			num = scanner.nextInt();
			sum=sum+num;
			
		} while(num != 0);
		System.out.println(sum);

	}

}
