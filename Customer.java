//Customer.java
import CheckingAccount
import SavingsAccount

class Customer extends User{
	CheckingAccount checking;
	SavingsAccount savings;
	
	public static void main(String[] args){
		System.out.println("Running main in Customer.java");
	}//end main

	public Customer(){
		System.out.println("Running Customer in Customer.java");

	}//end Customer

	public Customer(String tempUser, String tempPIN){
		System.out.println("Running Customer(2) in Customer.java");

	}//end Customer(2)
	
	//Start hasMenu Methods
	public void start(){
		System.out.println("Running start in Customer.java");

	}//end Start

	public String menu(){
		System.out.println("Running menu in Customer.java");

	}//end menu
	//end hasMenu Methods

	public changePin(){
		System.out.println("Running changePin in Customer.java");

	}//end changePin

	public String getReport(){
		System.out.println("Running getReport in Customer.java");

	}//end getReport
}//end class
