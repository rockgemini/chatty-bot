package test;

import java.util.Scanner;

public class SumOfNumbersInRange {
	/**
     * The method calculates the sum of integers in a given range
     * 
     * @param from inclusive
     * @param to exclusive
     *
     * @return the sum (long)
     */
    public static long sumInRange(int from, int to) {
        int i, sum=0;
        for(i=from;i<to;i++)
        { 
        	sum=sum+i;
        	Long.valueOf(sum);
        } return sum;
    }
    

    /* Do not change code below */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		final Scanner scanner = new Scanner(System.in);

        int from = scanner.nextInt();
        int to = scanner.nextInt();

        System.out.println(sumInRange(from, to));

	}

}
