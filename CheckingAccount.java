//CheckingAccount.java
import java.util.*;
class CheckingAccount implements HasMenu{
	double balance;
	Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Running Main in CheckingAccount.java");
		CheckingAccount test = new CheckingAccount(8);
		test.start();
		test.setBalance();
	}//end Main

	public CheckingAccount(){
		//System.out.println("Running Constructer in CheckingAccount.java");
		balance = 0;
	}// end CheckingAccount()

	public CheckingAccount(double bal){
		//System.out.println("Running Constructer(1) in CheckingAccount.java");
		balance = bal;
	}//end CheckingAccount(1)

	//HasMenu.java Methods
	public String menu(){
		//System.out.println("Running menu in CheckingAccount.java");
		System.out.println("-------------------------");
		String choice;
		boolean keepGoing = true;

		System.out.println("Account Menu");
		System.out.println();
		System.out.println("0) Quit");
		System.out.println("1) Check Balance");
		System.out.println("2) Make a deposit");
		System.out.println("3) Make a withdrawal");
		System.out.println(" ");
		while(keepGoing){
			System.out.print("Please enter 0-3: ");
			choice = input.nextLine();
			System.out.println(" ");
			if(choice.equals("0")){
				return("0");
			}//end if
			else if(choice.equals("1")){
				return("1");
			}//end elif
			else if(choice.equals("2")){
				return("2");
			}//end elif
			else if(choice.equals("3")){
				return("3");
			}//end elif
			else{
				System.out.println("!!!INVALID CHOICE!!!");
			}//end else
			System.out.println(" ");
		}//end while
	return("0");
	}//end menu	

	public void start(){
		//System.out.println("Running start in CheckingAccount.java");
		boolean keepGoing = true;

		while(keepGoing){
			String choice = menu();
			if(choice.equals("0")){
				keepGoing = false;
			}//end if
			else if(choice.equals("1")){
				checkBalance();
			}//end elif
			else if(choice.equals("2")){
				makeDeposit();
			}//end elif
			else if(choice.equals("3")){
				makeWithdrawal();
			}//end elif
			else{
				System.out.println("!!!CHOICE ERROR!!!");
			}//end else
		}//end while
	}//end start
	//End HasMenu.java Methods
	
	public double getBalance(){
		//System.out.println("Running getBalance in CheckingAccount.java");
		double doubbal = Double.valueOf(balance);
		return(doubbal);
	}//end getBalance

	public String getBalanceString(){
		//System.out.println("Running getBalanceString in CheckingAccount.java");
		String temp = String.valueOf(balance);
		return(temp);	
	}//end getBalanceString

	public void setBalance(){
		//System.out.println("Running setBalance in CheckingAccount.java");
		System.out.print("Current balance: $");
		System.out.format("%.2f", balance);
		System.out.println();
		System.out.print("Set new balance: $");
		balance = getDouble();
		System.out.print("New balance is: $");
		System.out.format("%.2f", balance);
		System.out.println();
	}//end setBalance

	public void checkBalance(){
		//System.out.println("Running checkBalance in CheckingAccount.java");
		System.out.println("Checking balance...");
		System.out.print("Current balance: $");
		System.out.format("%.2f", balance);
		System.out.println(" ");
	}//end checkBalance

	private double getDouble(){
		//System.out.println("Running getDouble in CheckingAccount.java");
		while(true){	
			try{
				String temp = input.nextLine();
				double doub = Double.valueOf(temp);
				return(doub);
			} catch(NumberFormatException e){
				System.out.println("!!!ENTER A NUMBER!!!");
			}//end exception
		}//end while
	}//end getDouble

	public void makeDeposit(){
		//System.out.println("Running makeDeposit in CheckingAccount.java");
		System.out.println("Making a deposit...");
		System.out.print("How much to deposit? $");
		double amount = getDouble();
		balance = balance + amount;
		System.out.print("New balance: $");
		System.out.format("%.2f", balance);
		System.out.println();
	}//end makeDeposit

	public void makeWithdrawal(){
		//System.out.println("Running makeWithdrawal in CheckingAccount.java");
		System.out.println("Making a withdrawal...");
		System.out.print("How much to withdrawal? $");
		double amount = getDouble();
		if(amount > balance){
			System.out.println("!!!AMOUNT EXCEEDS ACCOUNT BALANCE!!!");
			System.out.println("ABORTING WITHDRAWAL");
		}//end if
		else{
			balance = balance - amount;
			System.out.print("New balance: $");
			System.out.format("%.2f", balance);
		}//end else
		System.out.println();
	}// end makeWithdrawal
}//end class
