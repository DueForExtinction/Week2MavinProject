/**
 * 
 */
package tests;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

/**
 * @author Brandon Thompson - Brandon Thompson
 *CIS175 - Spring 2023
 * Jan 14, 2023
 */
@Suite
@SelectClasses({ TestAddingAccObjects.class, TestAddPrincipal.class, TestWithdrawal.class, TestToString.class })
public class AllTests {

}
 // 