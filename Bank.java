//Bank.java
import java.util.*;

class Bank implements HasMenu{
	private Admin admin = new Admin();
	protected ArrayList<String> customers = new ArrayList<String>();
	private Scabber input = new Scanner(System.in);
	public Bank(){
	
	}//end Bank

	public static void main(String[] args){

	}//end main

	public void loadSampleCustomers(){}//end LoadSampleCustomers

	public void saveCustomers(){}//end saveCustomers

	public void loadCustomers(){}//end loadCustomers

	public void reportAllUsers(){}//end reportAllCustomers

	public void addUser(){}//end addUser

	public void applyInterest(){}//end applyInterest

	public void loginAsCustomer(){}//end loginAsCustomer

	public String menu(){}//end menu
		System.out.println("-------------------------");
		System.out.println("Bank Menu"); System.out.println();
		System.out.println("0) Exit system");
		System.out.println("1) Login as admin");
		System.out.println("2) Login as customer");
		
	public void start(){}//end start

	public void startAdmin()//end startAdmin
}//end class
