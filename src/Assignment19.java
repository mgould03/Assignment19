import java.util.Scanner;
public class Assignment19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalItems = scanner.nextInt();
        int currentSequenceLength = 0;
        int longestSequenceLength = 0;
        for (int i = 0; i < totalItems; i++) {
            String item = scanner.next();
            if (!item.equals("I")) {
                currentSequenceLength++;
            } else {
                if (currentSequenceLength > longestSequenceLength) {
                    longestSequenceLength = currentSequenceLength;
                }
                currentSequenceLength = 0;
            }
        }
        if (currentSequenceLength > longestSequenceLength) {
            longestSequenceLength = currentSequenceLength;
        }
        System.out.println(longestSequenceLength);
        scanner.close();
    }
}