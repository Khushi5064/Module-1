package Module_1;

import java.util.Scanner;

public class Que_4 {
	public static void main(String args[]) {
		int i, no=0, sum=0;
		double avg;{
			System.out.println("Enter value of i: ");
		}
		for(i=1; i<=5; i++) {
			Scanner sc = new Scanner(System.in);
			no = sc.nextInt();
			
			sum += no;
		}
		avg = sum/5;
		System.out.println("Sum of given numbers are: " +sum+ "\nAverage of all numbers is: "+avg);
	}
}
