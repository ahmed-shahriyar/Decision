import java.util.Scanner;
public class HalfWordCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word:");
        String word = scanner.nextLine();
        int length = word.length();
        int middleIndex = length / 2;
        int endIndexFirstHalf = middleIndex;
        int startIndexSecondHalf = middleIndex + (length % 2 == 0 ? 0 : 1);
        String firstHalf = word.substring(0, endIndexFirstHalf);
        String secondHalf = word.substring(startIndexSecondHalf);

        if (firstHalf.equals(secondHalf)) {
            System.out.println("First and second half are the same.");
        } else {
            System.out.println("First and second half are different.");
        }
        scanner.close();
    }
}
