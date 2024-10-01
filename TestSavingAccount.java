package assignment;

import java.util.Scanner;

public class TestSavingAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		SavingAccount saver1 = new SavingAccount();
		SavingAccount saver2 = new SavingAccount();
		System.out.println("Enter Ac.holder name:");
		String name = sc.next();
		saver1.setName(name);
		System.out.println("Enter deposit amount:");
		double deposit = sc.nextDouble();
		saver1.setDeposit(deposit);
		System.out.println("Enter annual rate:");
		float annualInterestRate = sc.nextFloat();
		saver1.setAnnualInterestRate(3);

		System.out.println(saver1.getName());
		System.out.println(saver1.getDeposit());
		System.out.println(saver1.getAnnualInterestRate());
		saver1.calMonthlyInterest();

		System.out.println("==============================");
		System.out.println("Enter Ac.holder name:");
		name = sc.next();
		saver2.setName(name);
		System.out.println("Enter deposit amount:");
		deposit = sc.nextDouble();
		saver2.setDeposit(deposit);
		System.out.println("Enter annual rate:");
		annualInterestRate = sc.nextFloat();
		saver2.setAnnualInterestRate(3);

		System.out.println(saver2.getName());
		System.out.println(saver2.getDeposit());
		System.out.println(saver2.getAnnualInterestRate());
		saver2.calMonthlyInterest();

	}

}
