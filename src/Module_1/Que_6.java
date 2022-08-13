package Module_1;

import java.util.Scanner;

public class Que_6 {
	public static void main(String[] args) {
		int i, j, no, k=1;
		
		System.out.println("Enter any number: ");
		Scanner sc = new Scanner(System.in);
		no = sc.nextInt();
		for(i=1; i<=no; i++) 
		{
			for(j=1; j<=i; j++) 
			{ 
				System.out.print(k++);
			}
			System.out.println( );
		}
	}
}
