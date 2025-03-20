//User.java
import java.util.*

abstract class User implements HasMenu{
	String userName;
	String PIN;
	Scanner input = new Scanner(System.in);
	/* Being hasMenu methods
	public String menu(){
		System.out.println("Running menu in User.java");
	}//end menu

	public void start(){
		System.out.println("Running start in User.java");
	}//end start
	end hasMenu methods */
	public boolean login(){
		System.out.println("Running login in User.java");
		System.out.print("User name: ");
		String tempUser = input.nextLine();
		System.out.println();
		System.out.print("PIN:");
		String tempPIN = input.nextLine();
		if(tempUser.equals(userName) && tempPIN.equals(PIN)){
			System.out.println("Login Successful");
			return(true);
		}//end if
		else{
			System.out.println("Login Unsuccessful");
			return(false);
		}//end else
	}//end login

	public boolean login(String tempUser, String tmepPIN){
		System.out.println("Running login(2) in User.java");
		if(tempUser.equals(userName) && tempPIN.equals(PIN)){
			System.out.println("Login Successful");
			return(true);
		}//end if
		else{
			System.out.println("Login Unsuccessful");
			return(false);
		}//end else
	}//end login(2)
	
	public void setUserName(userName){
		System.out.println("Running setUserName in User.java");
		System.out.print("Set User name: ");
		username = input.nextLine();
		System.out.prinln();
		System.out.println("User name: " +  username);
	}//end setUserName
	
	public String getUserName(){
		System.out.println("Running getUserName in User.java");
		System.out.println("Fetching user name...");
		System.out.println("User name: " + username);
		return(username);
	}//end getUserName
	
	public void setPIN(PIN){
		System.out.println("Running setPIN in User.java");
		System.out.print("Set PIN: ");
		PIN = input.nextLine();
		System.out.println();
		System.out.println("New PIN is: " + PIN);
	}//end setPIN
	
	public String getPIN(){
		System.out.println("Running getPIN in User.java");
		System.out.println("Fetching PIN...");
		System.out/println("PIN: " + PIN);
		return(PIN);
	}//end getPIN
	
	abstract String getReport();
}//end abstract class
