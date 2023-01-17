/**
 * 
 */
package model;

import java.util.ArrayList;

/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Jan 14, 2023
 */
public class AccLogic { // Variable declaration
	
	private ArrayList<Account> accList = new ArrayList<Account>(); // ArrayList to hold Account objects to later print information.

	public AccLogic(ArrayList<Account> accList) { // Constructor with args
		super();
		this.accList = accList;
	}
	
	

	public AccLogic() { // No arg constructor
		super();
	}



	/**
	 * @return the accList
	 */
	public ArrayList<Account> getAccList() {
		return accList;
	}

	/**
	 * @param accList the accList to set
	 */
	public void setAccList(ArrayList<Account> accList) {
		this.accList = accList;
	}
	
	public void addPrincipal(Account e, double principal) { // Allows user to add money to account.
		double principalToAdd = principal;
		if(principalToAdd > 0) {
			e.setPrincipal(principalToAdd + e.getPrincipal());
		}
		else {
			System.out.println("You cannot add negative numbers.");
		}
		
	}
	
	public void subtractPrincipal(Account e, double withdrawal) { // allows user to withdrawal money from account
		double ammountToWithDrawal;
		ammountToWithDrawal = withdrawal;
		if(ammountToWithDrawal < e.getPrincipal() && ammountToWithDrawal > 0) {
			e.setPrincipal( e.getPrincipal() - ammountToWithDrawal);
		}
		else {
			System.out.println("Withdrawal denied.");
		}
	}
	
	public void addAccount(Account e) { // Adds Account objects to array list
		accList.add(e);
	}

	public String toString(Account e) { // prints information about the Account objects.
		return "Name of account holder is: " + e.getAccName() + "\nAddress is: " + e.getStreet() + ", " + e.getCity()
		+ ", " + e.getState() + ", " + e.getZipcode() + "\nTotal in account: $" + e.getPrincipal();
	}
	
	
	
}
