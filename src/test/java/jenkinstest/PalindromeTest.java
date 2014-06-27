package jenkinstest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PalindromeTest {
	
	@Test
	public void isPalindromeTest() {
		Assert.assertFalse(Palindrome.isPalindrome("Otto"), "Ist kein Palindrome");
	}

	@Test
	public void isNoPalindromeTest() {
		Assert.assertFalse(Palindrome.isPalindrome("Test"), "Ist ein Palindrome");
	}

}
