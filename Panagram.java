import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {
    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        Set<Character> alphabetSet = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                alphabetSet.add(ch);
            }
        }

        return alphabetSet.size() == 26;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean result = isPangram(input);

        if (result) {
            System.out.println("Input is a pangram.");
        } else {
            System.out.println("Input is not a pangram.");
        }
    }
}
