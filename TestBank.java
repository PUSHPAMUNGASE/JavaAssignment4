package assignment2oct;
import java.util.Scanner;

public class TestBank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Bank bank=new Bank();
//		BankA bankA=new BankA(34000, "pushpa", "ICICI",10);
//		System.out.println("Enter name");
//		String name=sc.next();
//		bankA.setName(name);
//		System.out.println("Enter deposit moeny");
//		double moeny=sc.nextDouble();
//		bankA.setMoeny(moeny);
//		System.out.println("Enter bank Name");
//		String bankName=sc.next();
//		bankA.setBankname(bankName);
//		System.out.println("Enter percent rate");
//		float percentRate=sc.nextFloat();
//		bankA.setPercentRate(percentRate);
		
		
//		System.out.println("Name is: "+ bankA.getName());
//		System.out.println("Deposited moeny : "+ bankA.getMoeny());
//		bankA.applyInterest();
//		
		
		
		
		System.out.println("========================================");
		BankA bankB=new BankB(23000, "komal", "ICICI", 20, 36000, "pushpa", "baroda", 15);
//		System.out.println("Enter name");
//		 name=sc.next();
//		bankB.setName(name);
//		System.out.println("Enter deposit moeny");
//		 moeny=sc.nextDouble();
//		bankB.setMoeny(moeny);
//		System.out.println("Enter bank Name");
//		 bankName=sc.next();
//		bankB.setBankname(bankName);
//		System.out.println("Enter percent rate");
//		 percentRate=sc.nextFloat();
//		bankB.setPercentRate(percentRate);
		
		
		System.out.println("Name is: "+ bankB.getName(name));
		System.out.println("Deposited moeny : "+ bankB.getMoeny());
		bankB.applyInterest();
		
		
		

	}

}
