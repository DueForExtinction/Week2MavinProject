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
 * Jan 14, 2023
 */
class TestAddingAccObjects {
	AccLogic newAccList = new AccLogic();
	Account newAcc = new Account("Brandon", "123 Street Ave", "Des Moines", "51515", "Iowa", 800);
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testAddingAccObjects() {
		newAccList.addAccount(newAcc);
		assertEquals(1, newAccList.getAccList().size());
	}
	
	@Test
	void testRemovingAccObjects() {
		newAccList.addAccount(newAcc);
		newAccList.getAccList().remove(0);
		assertEquals(0, newAccList.getAccList().size());
	}
	

}
