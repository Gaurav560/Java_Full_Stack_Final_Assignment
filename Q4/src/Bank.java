import java.util.Scanner;

public class Bank {


	
static Double currBal = (double) 0;
 static Double withdrawal = (double) 0;
static 	 Double deposit = (double) 0;
	static  Scanner scanner = new Scanner(System.in);

	public void depositMoney() {
		System.out.println("Enter the amount you want to deposit in your account::");
		deposit = scanner.nextDouble();
		currBal =currBal+deposit;
		System.out.println("Success .money deposited in account.");
	}

	public void checkBalance() {
		System.out.println(currBal);
	}

	public void WithdrawMoney() {
		System.out.println("Enter the amount you want to withdraw from your account::");
	withdrawal = scanner.nextDouble();
		currBal =currBal-withdrawal;
		System.out.println("please collect your money ..");
	}

	public void logic(int i) {

		Bank bank = new Bank();

		if (currBal <= 0 && i!=4) {

			System.out.println("your current balance is 0.first deposit the money in your account");
			bank.depositMoney();
		} else if (i == 1) {
			bank.depositMoney();
		} else if (i == 2) {
			bank.WithdrawMoney();
		} else if (i == 3) {
			bank.checkBalance();
			;
		} else if (i == 4) {
			System.out.println("Thanks for using this atm .");
			System.exit(0);

		}
		main(null);
	}

	public static void main(String[] args) {
	scanner=new Scanner(System.in);
		System.out.println("Press 1 for deposit::");
		System.out.println("Press 2 for withdrawal::");
		System.out.println("Press 3 for currentBal::");
		System.out.println("Press 4 for exit.");
		int i = scanner.nextInt();

		Bank bank = new Bank();
		if (i == 1 || i == 2 || i == 3 || i == 4) {
			bank.logic(i);
		} else {
			System.out.println("oops ! you entered the wrong input.");
		}

	}

}
