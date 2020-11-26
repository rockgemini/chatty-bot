package test;

import java.util.Scanner;
/*Write a program that reads a string and two integer numbers. These two numbers are representing a range that includes them both. 
 * Print the substring enclosed in this range. Both numbers are always greater than or equal to 0 and less than the string length.*/
public class ExtractSubstring {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        String inputStr = scanner.next();
        int indexOne = scanner.nextInt();
        int indexTwo = scanner.nextInt();
        
        System.out.println(inputStr.substring(indexOne, (indexTwo+1)));

	}

}
