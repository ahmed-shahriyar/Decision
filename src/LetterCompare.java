import java.util.Scanner;
public class LetterCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string:");
        String input = scanner.nextLine();
        char firstLetter = input.charAt(0);
        char lastLetter = input.charAt(input.length() - 1);

        if (firstLetter == lastLetter) {
            System.out.println("First and last letter are the same.");
        } else {
            System.out.println("First and last letter are different.");
        }
        scanner.close();
    }
}
