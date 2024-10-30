import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer:");
        int number = scanner.nextInt();
        if (number < 0) {
            number = number * -1;
        }
        int digitCount = 1;
        while (number >= 10) {
            number = number / 10;
            digitCount++;
        }
        System.out.println("The number has " + digitCount + " digit(s).");
        scanner.close();
    }
}
