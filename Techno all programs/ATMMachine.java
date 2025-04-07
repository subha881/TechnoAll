

import java.util.Scanner;

public class ATMMachine {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int balance =1000;
		
		String choice ="";
		do {
			System.out.println("Welcome to SBI");
		 System.out.println("Please insert your card");
		 System.out.println("Enter Pin");
		 System.out.println("");
		 System.out.println("1. Balance check");
		 System.out.println("2. Amount withdrawl");
		 System.out.println("3. Change pin");
		 System.out.println("4. Print PassBook");
		 System.out.println("5. Deposit");
		 
		 System.out.println("please select option from above");
		 
		 int option = sc.nextInt();
		 
		 switch(option) {
		 case 1:
			 System.out.println("Available Balance is :"+balance);
		 case 2:
			 System.out.println("Enter a amount withdraw");
			 double amount = sc.nextDouble();
			 System.out.println("Please collect your cash");
		 case 3:
			 System.out.println("please enter new pin");
			 
			 System.out.println("Your pin is reseted successfully");
		 case 4:
			 System.out.println("Your passbook is printed successfully !");
		 case 5:
			 System.out.println("Please enter amount to deposit");
			 double deposit = sc.nextDouble();
			 System.out.println(deposit+" Rs is has been credited in your account");
			 }
		 System.out.println("do you want to continue?(yes/no)");
		 	choice = sc.next();
		}while(choice.equalsIgnoreCase("Yes"));
		
		System.out.println("Thank you! Visit Again!");
	}

}
/*
 * Welcome to SBI
 * Please insert your card
 * Please enter your Pin
 *  7878
 * 1.Balance check
 * 2.Amount withdrawl
 * 3.change pin
 * 4.print passbook
 * 5.Deposit
 *
 * please select option from above
 * 5
 * enter amount to deposit
 * 5000
 * your amount 5000 is successfully deposited
 * do you want to continue?(yes/no)
 * yes
 * Welcome to SBI
 * Please insert your card
 * Please enter your Pin
 * 1.Balance check
 * 2.Amount withdrawl
 * 3.change pin
 * 4.print passbook
 * 5.Deposit
 * please select option from above
 *  2
 *  enter amount
 *  500
 *  please collect cash
 *  
 *  do you want to continue?(yes/no)
 *  no
 *  Thank you ! Visit Again !
 * 
 * 
 * 
 * chioice = "Java"
 * 
 * java
 * choice.equals("java")
 * 
 * 
 */