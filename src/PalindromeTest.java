import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void testSingleWordPalindrome() {
        assertTrue(Palindrome.isPalindrome("madam"));
    }

    @Test
    public void testSingleWordNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    public void testNumberPalindrome() {
        assertTrue(Palindrome.isPalindrome("2002"));
    }

    @Test
    public void testNumberNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("1234"));
    }

    @Test
    public void testPhrasePalindrome() {
        assertTrue(Palindrome.isPalindrome("A man a plan a canal Panama"));
    }

    @Test
    public void testPhraseNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("This is not a palindrome"));
    }

    @Test
    public void testMixedCasePalindrome() {
        assertTrue(Palindrome.isPalindrome("NoLemonNoMelon"));
    }

    @Test
    public void testMixedCaseNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("NoLemonNoWatermelon"));
    }
}
