

public class MyClass implements Palindrome {
    public boolean isPalindrome(long x) {
        String str = String.valueOf(Math.abs(x));
        char[] charArray = str.toCharArray();
        for(int i = 1; i <= (int)(charArray.length/2); ++i)
            if (charArray[i - 1] != charArray[charArray.length - i])
                return false;
        return true;
    }
}