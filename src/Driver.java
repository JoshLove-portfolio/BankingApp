import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
	
	static ArrayList<Object> customers = new ArrayList<Object>();

	public static void main(String[] args) {
		
		while(true) {
			displayMenu.getMenu();
		
			String userInput = "";
		
			Scanner scnr = new Scanner(System.in);
		
			userInput = scnr.nextLine();
		
			if (userInput.equals("1")) {
				
				Driver.addCustomer();
				return;
				
			} else if (userInput.equalsIgnoreCase("x")) {
				
				break;
				
			}
		}

	}
	
	public static void addCustomer() {
		
		String firstName = "";
		String lastName = "";
		String fullName = "";
		int Age = 0;
		int ssNum = 0;
		float startingBalance = 0;
		
		Scanner scnr = new Scanner(System.in);
		
		customers newCustomer = new customers(null, 0, 0, 0);
		
		try { 
		System.out.println("Enter customer's first name: ");
		firstName = scnr.nextLine();
		
		System.out.println("Enter customer's last name: ");
		lastName = scnr.nextLine();
		
		newCustomer.setCustomerName(firstName, lastName);
		
		fullName = newCustomer.getCustomerName();
		
		System.out.println("Enter customer's age: ");
		Age = scnr.nextInt();
		
		System.out.println("Enter social number (no dashs): ");
		ssNum = scnr.nextInt();
		
		System.out.println("Enter starting balance: ");
		startingBalance = scnr.nextFloat();
		
		Driver.arrayAdd(fullName, Age, ssNum, startingBalance);
		
		for(int i = 0; i < customers.size(); i++) {
			//FIXME - need to figure out how to print
		}
		
		} catch(InputMismatchException exception) { //#FIXME - need loop
			
			System.out.println("Error on type");
			return;
			
		}
	}
		

	
	public static void arrayAdd(String full, int age, int ss, float starter ) {
		customers addCustomer = new customers(full, age, ss, starter);
		customers.add(addCustomer);
	}

}
