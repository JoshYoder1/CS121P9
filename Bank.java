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
		System.out.println(customers);
		start();
		System.out.println(customers);
		saveCustomers();
	}//end Bank

	public static void main(String[] args){
		System.out.println("Running Main in Bank");
		Bank bank = new Bank();
		//bank.start();
	}//end main

	public void loadSampleCustomers(){}//end LoadSampleCustomers
		

	public void saveCustomers(){
		try{
			FileOutputStream fo = new FileOutputStream("customers.dat");
			System.out.print(1);
			ObjectOutputStream obOut = new ObjectOutputStream(fo);
			System.out.print(2);
			obOut.writeObject(customers);
			System.out.print(3);
			System.out.println("Save ArrayList... Successful!");
			obOut.close();
			fo.close();
		}catch(Exception e){
			System.out.println("Save Unsuccessful");
			e.printStackTrace();
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
			System.out.println("Load Unsuccessful");
			System.out.println(e.getMessage());
		}//end try
	}//end loadCustomers

	public void reportAllUsers(){
		for(Customer i : customers){
			System.out.println(i.getReport());
		}//end for
	}//end reportAllCustomers

	public void addUser(){
		System.out.print("Set Username: ");
		String user = input.nextLine();
		System.out.print("Set PIN: ");
		String pin = input.nextLine(); System.out.println();
		customers.add(new Customer(user, pin));
	}//end addUser

	public void applyInterest(){
	
	}//end applyInterest

	public void loginAsCustomer(){
		System.out.print("Username: ");
		String User = input.nextLine();
		System.out.print("PIN: ");
		String Pin = input.nextLine(); System.out.println();
		for(Customer i : customers){
			if(i.login(User, Pin)){
				i.start();
			}//end if
		}//end for
	}//end loginAsCustomer

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
			System.out.println("here");
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
		if(admin.login()){
			boolean keepGoing = true;
			while(keepGoing){
				String choice = admin.menu();
				if(choice.equals("1")){
					reportAllUsers();
				}//end if
				else if(choice.equals("2")){
					addUser();
				}//end elif
				else if(choice.equals("3")){
					applyInterest();
				}//end elif
				else if(choice.equals("0")){
					keepGoing = false;
				}//end elif
				else{
					System.out.println("!!!Please enter 0-3!!!");
				}//end else
			}//end while
		}//end startAdmin
	}//end startAdmin
}//end class
