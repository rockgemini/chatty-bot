package test;

import java.util.Scanner;
//Method to calculate power based on supplied 2 numbers where n is base and m is exponent
public class RaiseToPower {

	public static long power(int n, int m) {
      long power = (long) (Math.pow(n, m));
      return power;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }

}
