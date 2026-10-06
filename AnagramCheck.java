import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String word1 = sc.nextLine();

        System.out.print("Enter second word: ");
        String word2 = sc.nextLine();

        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();

        if (word1.length() == word2.length()) {
            char[] a1 = word1.toCharArray();
            char[] a2 = word2.toCharArray();

            Arrays.sort(a1);
            Arrays.sort(a2);

            if (Arrays.equals(a1, a2)) {
                System.out.println("The words are Anagram");
            } else {
                System.out.println("The words are Not Anagram");
            }
        } else {
            System.out.println("The words are Not Anagram");
        }
    }
}
