import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite tekst: ");
        String userInput = scanner.nextLine();

        if (Palindrome.isPalindrome(userInput)) {
            System.out.println("Tekst je palindrom.");
        } else {
            System.out.println("Tekst nije palindrom.");
        }

        scanner.close();
    }
}
