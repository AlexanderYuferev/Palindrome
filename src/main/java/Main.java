
import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        long number = input.nextInt();
        Palindrome palindrome = new MyClass();
        System.out.print(palindrome.isPalindrome(number));
    }
}