/**
 * 
 */
package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.AccLogic;
import model.Account;

/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Jan 15, 2023
 */
class TestToString {
	AccLogic newAccList = new AccLogic();
	Account newAcc = new Account("Brandon", "123 Street Ave", "Des Moines", "51515", "Iowa", 800);
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		newAccList.addAccount(newAcc);
		assertEquals("Name of account holder is: Brandon\nAddress is: 123 Street Ave, Des Moines, Iowa, 51515\nTotal in account: $800.0", newAccList.toString(newAcc));
	}

}
