package Module_1;

import java.util.Scanner;

public class Que_1 {
	public static void main(String args[]) {
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a: ");
		a = sc.nextInt();
		System.out.println("Enter b: ");
		b = sc.nextInt();
		System.out.println("Enter c: ");
		c = sc.nextInt();
		if(a>c) {
			if(a>b) {
				System.out.println("A is greater");
			}
			else {
				System.out.println("B is greater");
			}
		}
		else {
			if(b>c) {
				System.out.println("B is greater");
			}
			else {
				System.out.println("C is greater");
			}
		}
	}
}