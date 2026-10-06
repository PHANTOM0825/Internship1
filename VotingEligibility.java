import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age > 0 && age <= 100) {
            if (age >= 18) {
                System.out.println("Age is valid and eligible for voting");
            } else {
                System.out.println("Age is valid and not eligible for voting");
            }
        } else {
            System.out.println("Age is not valid");
        }
    }
}
