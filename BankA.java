package assignment2oct;

public class BankA {

	protected double moeny;
	protected String name;
	protected String bankName;
	protected float percentRate;
	public BankA(double moeny, String name, String bankName,float percentRate) {
		super();
		this.moeny = moeny;
		this.name = name;
		this.bankName = bankName;
		this.percentRate=percentRate;
		
	}
	public double getMoeny() {
		return moeny;
	}
	public void setMoeny(double moeny) {
		this.moeny = moeny;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getbankName() {
		return bankName;
	}
	public void setBankname(String bankName) {
		bankName = bankName;
	}
	public float getPercentRate() {
		return percentRate;
	}
	public void setPercentRate(float percentRate) {
		this.percentRate = percentRate;
	}
	
	
	public double applyInterest() {
		double amount=moeny+moeny*percentRate/100;
		System.out.println("total amount from bankA="+amount);
		return(amount);
	}
	
}
