import java.util.Scanner;

public class PasswordValidator {

    // Method to check if password is valid
    public static boolean isValidPassword(String password) {

        int digitCount = 0;

        // Rule 1: Check length
        if (password.length() < 8) {
            return false;
        }

        // Rule 2 and 3: Check letters/digits and count digits
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            if (!Character.isLetterOrDigit(ch)) {
                return false; // only letters and digits allowed
            }

            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        // Rule 3: At least two digits
        return digitCount >= 2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}