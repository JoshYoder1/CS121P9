//Admin.java

class Admin extends User{
	private Scanner input = new Scanner(System.in);

	public Admin(){
	
	}//end Admin

	public String menu(){
		//boolean keepGoing = true;
		System.out.println("-------------------------");
		System.out.println("Admin Menu"); System.out.println();
		System.out.println("0) Exit this menu");
		System.out.println("1) Full customer report");
		System.out.println("2) Add user");
		System.out.println("3) Apply interest to savings accounts"); System.out.println("");
		System.out.print("Action: ");
		return(input.nextLine());
		/*while(keepGoing){
			System.out.print("Action: ");
			String choice = input.nextLine(); System.out.println();
			if(choice.equals("0")){
				System.out.println("Exit");
				keepGoing = false;
			}//end if
			else if(choice.equals("1")){
				System.out.println("Full customer report");
				return(choice);
			}//end elif
			else if(choice.equals("2")){
				System.out.println("Add User");
				return(choice);
			}//end elif
			else if(choice.equals("3")){
				System.out.println("Apply interest");
				return(choice);
			}//end elif
			else{
				System.out.println("Please enter 0-3");
			}//end else
		}*///end while
	}//end menu

	public void start(){
		boolean keepGoing;
		while(keepGoing){
			String choice = menu();
			if(choice.equals("1"){
				System.out.println("Full customer Report");
			}//end if
			else if(choice.equals("2")){
				System.out.println("Add User");
			}//end elif
			else if(choice.equals("3")){
				System.out.println("Apply Interest");
			}//end elif
			else{
				System.out.println("!!!Please enter 0-3!!!");
			}//end else
		}//end while
	}//end start
}//end class
