package Module_1;

import java.util.Scanner;

public class Que_9 {
	public static void main(String[] args) {
		System.out.println("Enter a character: ");
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		int asciiValue = ch;
		System.out.println("ASCII Value of " +ch+ " is: "+asciiValue);
	}
}
