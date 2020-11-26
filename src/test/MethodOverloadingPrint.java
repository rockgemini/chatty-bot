package test;

import java.util.Scanner;

/*There is a method print(String arg). The method outputs the name and its argument (in " ", cause it's a string). The output format for the string argument "test":

print("test")
Overload this method by writing a new method with the same name and two arguments: a string and an integer. The new method should print the name and both parameters, like:

print("test", 4)
Do not remove the existing method!*/

public class MethodOverloadingPrint {
	
	public static void print(String strArg) {
        System.out.println("print(\"" + strArg + "\")");
    }

	public static void print(String str, int val) {
        System.out.println("print(\"" + str + "\", "+ val+")");
    }


    /* Do not change code below */

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int val = scanner.nextInt();
        print(str);
        print(str, val);

	}

}
