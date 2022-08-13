package Module_1;

import java.util.concurrent.CountDownLatch;

public class Que_8 {
	public static void main(String args[]) {
		String s = "Hello! How are you!!";
		Count (s);
	}

	private static void Count(String x) {
		char[] ch = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int otherchar = 0;
		for(int i=0; i<x.length(); i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
			}
			else if(Character.isDigit(ch[i])){
				num++;
			}
			else if(Character.isSpaceChar(ch[i])) {
				space++;
			}
			else {
				otherchar++;
			}
		}
		System.out.println("The String is: " +x);
		System.out.println("Letters in a string: " +letter);
		System.out.println("space in a string: " +space);
		System.out.println("Digits/Number in a string: " +num);
		System.out.println("Others: " +otherchar);
	}
}
