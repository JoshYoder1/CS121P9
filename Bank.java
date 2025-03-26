//Bank.java
import java.util.*;
import java.io.*;

class Bank implements HasMenu{
	private Admin admin = new Admin();
	protected ArrayList<Customer> customers = new ArrayList<Customer>();
	private Scanner input = new Scanner(System.in);
	
	public Bank(){
		//loadSampleCustomers();
		//saveCustomers();
		loadCustomers();
		start();
		saveCustomers();
	}//end Bank

	public static void main(String[] args){
		System.out.println("Running Main in Bank");
		Bank bank = new Bank();
		bank.start();
	}//end main

	public void loadSampleCustomers(){}//end LoadSampleCustomers
		

	public void saveCustomers(){
		try{
			FileOutputStream fo = new FileOutputStream("customers.dat");
			ObjectOutputStream obOut = new ObjectOutputStream(fo);
			obOut.writeObject(customers);
			System.out.println("Save ArrayList... Successful!");
			obOut.close();
			fo.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}//end try	
	}//end saveCustomers

	public void loadCustomers(){
		try{
			FileInputStream fIn = new FileInputStream("customers.dat");
			ObjectInputStream obIn = new ObjectInputStream(fIn);
			customers = (ArrayList<Customer>)obIn.readObject();
			System.out.println("Load ArrayList... Successful!");
			obIn.close();
			fIn.close();
		} catch(Exception e){
			System.out.println(e.getMessage());
		}//end try
	}//end loadCustomers

	public void reportAllUsers(){}//end reportAllCustomers

	public void addUser(){}//end addUser

	public void applyInterest(){}//end applyInterest

	public void loginAsCustomer(){}//end loginAsCustomer

	public String menu(){
		System.out.println("-------------------------");
		System.out.println("Bank Menu"); System.out.println();
		System.out.println("0) Exit system");
		System.out.println("1) Login as admin");
		System.out.println("2) Login as customer"); System.out.println();
		System.out.print("Action: ");
		return(input.nextLine());
	}//end menu
		
	public void start(){
		boolean keepGoing = true;
		while(keepGoing){
			String choice = menu();
			System.out.println();
			if(choice.equals("0")){
				System.out.println("Goodbye!");
				keepGoing = false;
			}//end if
			else if(choice.equals("1")){
				//System.out.println("Function not available");
				startAdmin();
			}//end elif
			else if(choice.equals("2")){
				loginAsCustomer();
			}//end elif
			else{
				System.out.println("!!!INVALID OPTION!!!");
			}//end else
		}//end while
	}//end start

	public void startAdmin(){
		boolean status = admin.login();
		if(status){
			admin.start();
		}//end startAdmin
	}//end startAdmin
}//end class
