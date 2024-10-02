package assignment2oct;

public class BankC  extends BankB{
	protected double moeny;
	protected String name;
	protected String Bankname;
	protected float percentRate;
	public BankC(double moeny, String name, String bankName, float percentRate, double moeny2, String name2,
			String bankname2, float percentRate2, double moeny3, String name3, String bankname3, float percentRate3) {
		super(moeny, name, bankName, percentRate, moeny2, name2, bankname2, percentRate2);
		moeny = moeny3;
		name = name3;
		Bankname = bankname3;
		percentRate = percentRate3;
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
	public String getBankname() {
		return Bankname;
	}
	public void setBankname(String bankname) {
		Bankname = bankname;
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
