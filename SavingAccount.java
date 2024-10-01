package assignment;

public class SavingAccount {
	private String name;
 private  float annualInterestRate;
 private  double deposit;
 
 
 
 
 public String getName() {
	return name;
}




public void setName(String name) {
	this.name = name;
}




public float getAnnualInterestRate() {
	return annualInterestRate;
}




public void setAnnualInterestRate(float annualInterestRate) {
	this.annualInterestRate = annualInterestRate;
}




public double getDeposit() {
	return deposit;
}




public void setDeposit(double deposit) {
	this.deposit = deposit;
}




public void calMonthlyInterest(){
	 float mrate=(annualInterestRate)/12;
	 double amount=deposit+mrate;
	
	 System.out.println("total monthly saving is :" +  amount);
 };
}
