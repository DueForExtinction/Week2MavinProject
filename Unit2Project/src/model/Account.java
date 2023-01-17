/**
 * 
 */
package model;

/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Jan 14, 2023
 */
public class Account { // Variable declaration
	private String accName;
	private String street;
	private String city;
	private String zipcode;
	private String state;
	private double principal;
	
	public Account(String accName, String street, String city, String zipcode, String state, double principal) { // Constructor with arguments
		super();
		this.accName = accName;
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
		this.principal = principal;
	}

	public Account() { // No arg constructor
		super();
	}

	/**
	 * @return the accName
	 */
	public String getAccName() { // getters and setters
		return accName;
	}

	/**
	 * @param accName the accName to set
	 */
	public void setAccName(String accName) {
		this.accName = accName;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}

	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the principal
	 */
	public double getPrincipal() {
		return principal;
	}

	/**
	 * @param principal the principal to set
	 */
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	
	
	
}
