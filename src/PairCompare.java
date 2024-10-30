import java.util.Scanner;
public class PairCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter four integers value:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();

        if ((num1 == num2 && num3 == num4) ||
                (num1 == num3 && num2 == num4) ||
                (num1 == num4 && num2 == num3)){
            System.out.println("two pairs");
        } else {
            System.out.println("not two pairs");
        }
        scanner.close();
    }
}
