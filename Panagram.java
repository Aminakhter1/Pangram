import java.util.Scanner;
public class Panagram {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();
        boolean isPangram = isPangram(input);
         if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
     public static boolean isPangram(String str) {
         boolean[] alphabetPresent = new boolean[26];
        // Convert the input string to lowercase
        str = str.toLowerCase();
       // Iterate through the characters of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
           // Check if the character is a lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // Mark the corresponding letter as present
                alphabetPresent[ch - 'a'] = true;
            }
        }

        for (boolean present : alphabetPresent) {
            if (!present) {
                return false; // not pangram
            }
        }

        return true; // pangram
    }
}
