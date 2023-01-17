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
class TestWithdrawal {
	AccLogic newAccList = new AccLogic();
	Account newAcc = new Account("Brandon", "123 Street Ave", "Des Moines", "51515", "Iowa", 800);
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSubtractFromPrincipal() {
		newAccList.subtractPrincipal(newAcc, 500);
		assertEquals(300, newAcc.getPrincipal());
	}
	
	@Test
	void testSubtractFromPrincipalCannotGoNegative() {
		newAccList.subtractPrincipal(newAcc, 900);
		assertEquals(800, newAcc.getPrincipal());
	}
	
	@Test
	void testSubtractFromPrincipalDoesNotAllowNegativeNumbers() {
		newAccList.subtractPrincipal(newAcc, -900);
		assertEquals(800, newAcc.getPrincipal());
	}

}
