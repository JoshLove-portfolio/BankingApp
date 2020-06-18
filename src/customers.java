import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class customers {
	
	public customers(String fullName, int age, int ssNum, float startingBalance) {
	}
	
	String full = "";
	int customerAge = 0;
	int social = 0;
	float starting = 0;

	public void setCustomerName(String first, String last) {
		
		full = first + " " + last;
	}
	
	public String getCustomerName() {
		
		return full;
	}
	
	public void setCustomerAge(int age) {
		
		customerAge = age;
		
	}
	
	public int getCustomerAge() {
		
		return customerAge;
		
	}
	
	public void setCustomerSocial(int ss) {
		
		social = ss;
		
	}
	
	public int getCustomerSocial() {
		
		return social;
		
	}
	
	public void setStartingBalance(float starter) {
		starting = starter;
	}
	
	public float getStartingBalance() {
		return starting;
	}
	
	

	
}
