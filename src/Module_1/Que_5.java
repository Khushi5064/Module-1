package Module_1;

import java.util.Scanner;

public class Que_5 {
	public static void main(String[] args) {
		int i, j, no;
		
		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		for(i=1; i<=no; i++) 
		{
			for(j=1; j<=i; j++) 
			{ 
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
