package Module_1;

import java.util.Scanner;

public class Que_7 {
	public static void main(String args[]) {
		int n=0, i=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input any number less than 10 billion: ");
		n = sc.nextInt();
		
		while(n>0)
		{
			n = n/10;
			i = i+1;
		}
		System.out.println("Number of digits in the number = " +i);
	}
}
