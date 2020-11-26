package test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		long m = scanner.nextLong();
        int n = 0;
        long fact = 1;
        do {
            fact *= ++n;
        } while (fact <= m);
        System.out.println(n);    


	}

}
