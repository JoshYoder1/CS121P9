//Customer.java
//import CheckingAccount.java;
//import SavingsAccount.java;

class Customer extends User{
	CheckingAccount checking;
	SavingsAccount savings;
	
	public static void main(String[] args){
		System.out.println("Running main in Customer.java");
		Customer test = new Customer();
		test.start();

	}//end main

	public Customer(){
		System.out.println("Running Customer in Customer.java");
		//checking = CheckingAccount();
		//savings = SavingsAccount();
		System.out.println("Enter user name: ");
		userName = input.nextLine();
		System.out.println();
		System.out.println("Enter PIN: ");
		PIN = input.nextLine();
		System.out.println();
	}//end Customer

	public Customer(String tempUser, String tempPIN){
		System.out.println("Running Customer(2) in Customer.java");
		userName = tempUser;
		PIN = tempPIN;
	}//end Customer(2)
	
	//Start hasMenu Methods
	public void start(){
		System.out.println("Running start in Customer.java");
		boolean keepGoing = true;
		while(keepGoing){
			String choice = menu();
			if(choice.equals("1")){
				checking.start();
			}//end if
			else if(choice.equals("2")){
				savings.start();
			}//end elif
			else if(choice.equals("3")){
				changePin();
			}//end elif
			else{
				keepGoing = false;
			}//end else
		}//end while
	}//end Start

	public String menu(){
		System.out.println("Running menu in Customer.java");
		System.out.println();
		System.out.println("Customer Menu");
		System.out.println();
		System.out.println("0) Exit");
		System.out.println("1) Manage Checking Account");
		System.out.println("2) Manage Savings Account");
		System.out.println("3) Change PIN");
		boolean keepGoing = true;
		while(keepGoing){
			System.out.println();
			System.out.print("Please enter 0-3: ");
			String choice = input.nextLine();
			System.out.println();
			if(choice.equals("0")){
				keepGoing = false;
				return("0");
			}//end if
			else if(choice.equals("1")){
				keepGoing = false;
				return("1");
			}//end elif
			else if(choice.equals("2")){
				keepGoing = false;
				return("2");
			}//end elif
			else if(choice.equals("3")){
				keepGoing = false;
				return("3");
			}//end elif
			else{
				System.out.println("Choice must be 0, 1, 2, or 3.");
			}//end else
		}//end while
		return("0");
	}//end menu
	//end hasMenu Methods

	public void changePin(){
		System.out.println("Running changePin in Customer.java");
		
	}//end changePin

	public String getReport(){
		System.out.println("Running getReport in Customer.java");
		return(" ");
	}//end getReport
}//end class
