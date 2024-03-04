package ATMmachine;

import java.util.Scanner;

class ATM{
	
	float Balance;
	int PIN= 1047;
	
	public void Checkpin() {
		System.out.println("Enter Your Pin");
		Scanner sc=new Scanner(System.in);
		int enteredpin=sc.nextInt();
		
		//condition check
		if(enteredpin==PIN) {
			menu();
		}
		else {
			System.out.println("Enter the vaild pin");
			menu();
		}
	}
	
	public void menu() {
		System.out.println("Enter your Choice");
		System.out.println("1. Check A/C Balance");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Deposit Money");
		System.out.println("4. EXIT");
		
		Scanner sc=new Scanner(System.in);
		int opt =sc.nextInt();
		
		if(opt == 1) {
			checkBalance();
		}
		else if(opt == 2) {
			WithdrawMoney();
		}
		
		else if(opt == 3) {
			DepositeMoney();
		}
		
		else if(opt ==4) {
			return;
		}
		
		else {
			System.out.println("Enter a vaild Choice");
		}
	}
	
	public void checkBalance() {//
		System.out.println("Balance: " + Balance);
		menu();//menu method will run and it will show menu again for choice
	}
	
	public void WithdrawMoney() {//
	System.out.println("Enter Amount to Withdraw");
	Scanner m=new Scanner(System.in);
	float amount=m.nextFloat();
	
	if(amount>Balance) {
		
		System.out.println("insufficiant Balance");
	}
	else {
		Balance= Balance-amount;
		System.out.println("Money withdraw sucessfully");
	}
	menu();
	
}
public void DepositeMoney() {
	System.out.println("Enter the amount");
	Scanner sc= new Scanner(System.in);
	float amount= sc.nextFloat();
	Balance = Balance+amount;
	System.out.println("Money Deposited Successfully");
	menu();
}

}


public class ATMMachine {
	
public static void main(String[] args) {
	
	ATM obj = new ATM();
	obj.Checkpin();
	
}
}
