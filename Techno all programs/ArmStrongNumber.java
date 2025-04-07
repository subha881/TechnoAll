package p2;

import java.util.Scanner;

public class ArmStrongNumber {
	
	static checkIsArmstrongNumber(int no) {

		int sqaure = no*no;
		int sum = 0;
		while (sqaure > 0) {
			int digit = sqaure % 10;
			sum = sum + digit;
			
			sqaure = sqaure / 10;
		}

		if (no == sum) {
			System.out.println(no + " is Neon Number");
		} else {
			System.out.println(no + " is not Neon Number");
		}

	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int no = sc.nextInt();
		ArmStrongNumber  a1 = new ArmStrongNumber();
		a1.checkIsArmstrongNumber(no);

	}
}
/*
 * 
 * 
 * Neon Number
 * 
 *   no = 9
 *   9*9 = 81  = 8+1 =9
 *   
 *   WAP to check the given number is Perfect number or not?
 *   WAP to check the given number is Prime number or not?
 * 
 * 
 */