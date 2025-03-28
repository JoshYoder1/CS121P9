//User.java
import java.util.*;
import java.io.Serializable;
abstract class User implements HasMenu, Serializable{
	protected String PIN;
	protected String userName;
	//Scanner input = new Scanner(System.in);
	/* Being hasMenu methods
	public String menu(){
		System.out.println("Running menu in User.java");
	}//end menu

	public void start(){
		System.out.println("Running start in User.java");
	}//end start
	end hasMenu methods */
	public boolean login(){
		//System.out.println("Running login in User.java");
		Scanner input = new Scanner(System.in);
		System.out.print("User name: ");
		String tempUser = input.nextLine();
		//System.out.println();
		System.out.print("PIN: ");
		String tempPIN = input.nextLine();
		//input.close();
		if(tempUser.equals(userName) && tempPIN.equals(PIN)){
			System.out.println("Login Successful");
			return(true);
		}//end if
		else{
			System.out.println("Login Unsuccessful");
			return(false);
		}//end else
	}//end login

	public boolean login(String tempUser, String tempPIN){
		//System.out.println("Running login(2) in User.java");
		if(tempUser.equals(userName) && tempPIN.equals(PIN)){
			System.out.println("Login Successful");
			return(true);
		}//end if
		else{
			System.out.println("Login Unsuccessful");
			return(false);
		}//end else
	}//end login(2)
	
	public void setUserName(String tempUser){
		//System.out.println("Running setUserName in User.java");
		System.out.println("User name: " +  userName);
		userName = tempUser;
	}//end setUserName
	
	public String getUserName(){
		//System.out.println("Running getUserName in User.java");
		System.out.println("Fetching user name...");
		System.out.println("User name: " + userName);
		return(userName);
	}//end getUserName
	
	public void setPIN(String tempPin){
		//System.out.println("Running setPIN in User.java");
		if(tempPin.matches("\\d{4}")){
			PIN = tempPin;
			System.out.println("Setting PIN:" + PIN);
		}//end if
		else{
			System.out.println("PIN must be four digits, aall numeric");
			System.out.println("Setting PIN: 0000");
			PIN = "0000";
		}//end else
	}//end setPIN
	
	public String getPIN(){
		//System.out.println("Running getPIN in User.java");
		System.out.println("Fetching PIN...");
		System.out.println("PIN: " + PIN);
		return(PIN);
	}//end getPIN
	
	abstract String getReport();
}//end abstract class
