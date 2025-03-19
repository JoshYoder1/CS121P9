//SavingsAccount.java
class SavingsAccount extends CheckingAccount{
	
	double interestRate = 0.05;
	
	public static void main(String[] args){
		//System.out.println("Running main in SavingsAccount.java");
		SavingsAccount test = new SavingsAccount(12);
		test.start();
		test.setInterestRate();
		test.getInterestRate();
		test.calcInterest();
	}//end main

	public SavingsAccount(){
		System.out.println("Running SavingsAccount in SavingsAccount.java");
		balance = 0;
	}//end SavingsAccount

	public SavingsAccount(double bal){
		System.out.println("Running SavingsAccount(1) in SavingsAccount.java");
		balance = bal;
	}//end SavingsAccount(1)

	public void calcInterest(){
		//System.out.println("Calculating interest...");
		System.out.println("Balance: " + balance + "|Interest Rate: " + interestRate * 100 + "%");
		balance = balance + balance * interestRate;
		System.out.println("New balance: " + balance);
	}//end calcInterest
	
	public void setInterestRate(){
		//System.out.println("Running setInterestRate in SavingsAccount.java");
		System.out.print("Set interest rate by entering a percent: ");
		interestRate = getDouble();
		interestRate = interestRate * 0.01;
		System.out.println();
		System.out.println("Interest rate is:" + interestRate * 100 + "%");
	}//end setInterestRate

	public double getInterestRate(){
		//System.out.println("Running getInterestRate in SavingsAccount.java");
		System.out.println("Fetching interest rate...");
		System.out.println("Interest Rate is:" + interestRate * 100 + "%");
		System.out.println();
		return(interestRate);
	}//end getInterestRate
}//end class
