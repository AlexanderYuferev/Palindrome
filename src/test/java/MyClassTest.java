import org.junit.Test;
import static org.junit.Assert.*;

public class MyClassTest extends MyClass {

    Palindrome palindrome = new MyClass();

    @Test
    public void test_1() {
        assertEquals(palindrome.isPalindrome(12321), true);
    }

    @Test
    public void test_2() {
        assertEquals(palindrome.isPalindrome(-1221), true);
    }

    @Test
    public void test_3() {
        assertEquals(palindrome.isPalindrome(12320), false);
    }
}