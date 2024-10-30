import java.util.Scanner;
public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 'strict' or 'lenient' for increasing/decreasing order:");
        String mode = scanner.nextLine();
        System.out.print("Enter three numbers value:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        boolean lenientMode = mode.equalsIgnoreCase("lenient");

        if (lenientMode && ((num1 <= num2 && num2 <= num3) || (num1 >= num2 && num2 >= num3))) {
            System.out.println("Increasing");
        } else if (!lenientMode && num1 < num2 && num2 < num3) {
            System.out.println("Increasing");
        }
        else if (lenientMode && ((num1 >= num2 && num2 >= num3) || (num1 <= num2 && num2 <= num3))) {
            System.out.println("Decreasing");
        } else if (!lenientMode && num1 > num2 && num2 > num3) {
            System.out.println("Decreasing");
        }
        else {
            System.out.println("Neither");
        }
        scanner.close();
    }
}
