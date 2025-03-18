//CheckingAccount.java
import java.util.*
class CheckingAccount implements HasMenu{
	protected double balance;
	private Scanner input = new Scanner(System.in);
	public static void main(String[] args){
		System.out.println("Running Main in CheckingAccount.java");
		
		
	}//end Main

	public CheckingAccount(){
		System.out.println("Running Constructer in CheckingAccount.java");
	}// end CheckingAccount()

	public CheckingAccount(double balance){
		System.out.println("Running Constructer(1) in CheckingAccount.java");
	}//end CheckingAccount(1)

	//HasMenu.java Methods
	public String menu(){
		System.out.println("Running menu in CheckingAccount.java");
		String choice;
		boolean keepGoing = true;
		System.out.println("0) Quit");
		System.out.println("1) Check Balance");
		System.out.println("2) Make a deposit");
		System.out.println("3) Make a withdrawal");
		System.out.println(" ");
		while(keepGoing){	
			System.out.print("Please enter 0-3: ");
			choice = input.nextline();
			if(choice == "0"){
				return("0");
			}//end if
			else if(choice == "1"){
				return("1");
			}//end elif
			else if(choice == "2"){
				return("2");
			}//end elif
		}//end while
	}//end start	

	public void start(){
		System.out.println("Running start in CheckingAccount.java");
	}//end start
	//End HasMenu.java Methods
	
	public double getBalance(){
		System.out.println("Running getBalance in CheckingAccount.java");
	}//end getBalance

	public String getBalanceString(){
		System.out.println("Running getBalanceString in CheckingAccount.java");
	}//end getBalanceString

	public void setBalance(){
		System.out.println("Running setBalance in CheckingAccount.java");
	}//end setBalance

	public void checkBalance(){
		System.out.println("Running checkBalance in CheckingAccount.java");
	}//end checkBalance

	private double getDouble(){
		System.out.println("Running getDouble in CheckingAccount.java");
	}//end getDouble

	public void makeDeposit(){
		System.out.println("Running makeDeposit in CheckingAccount.java");
	}//end makeDeposit

	public void makeWithdrawal(){
		System.out.println("Running makeWithdrawal in CheckingAccount.java");
	}// end makeWithdrawal
}//end class
