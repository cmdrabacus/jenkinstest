package jenkinstest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeTest {
	
	@Test
	public void isPalindromeTest() {
		Assert.assertTrue(Palindrome.isPalindrome("Otto"), "Ist ein Palindrome");
	}

	@Test
	public void isNoPalindromeTest() {
		Assert.assertFalse(Palindrome.isPalindrome("Test"), "Ist kein Palindrome");
	}

}
