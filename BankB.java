package assignment2oct;

public class BankB extends BankA {
	
	protected double moeny;
	protected String name;
	protected String Bankname;
	protected float percentRate;
		
	public BankB(double moeny, String name, String bankName, float percentRate, double moeny2, String name2,
			String bankname2, float percentRate2) {
		super(moeny, name, bankName, percentRate);
		moeny = moeny2;
		name = name2;
		Bankname = bankname2;
		percentRate = percentRate2;
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
