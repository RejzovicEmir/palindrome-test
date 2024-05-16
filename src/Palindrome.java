public class Palindrome {

    public static boolean isPalindrome(String s) {
        // Ukloni sve ne-alfanumeričke karaktere i pretvori u mala slova
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        // Proveri da li je tekst isti kad se čita unazad
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}
