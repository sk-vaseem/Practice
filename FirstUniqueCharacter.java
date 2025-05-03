import java.util.HashMap;

public class FirstUniqueCharacter {
    public static char firstNonRepeatingCharacter(String s) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        // First pass: Count occurrences of each character
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Second pass: Find the first non-repeating character
        for (char c : s.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        return '-'; // If no unique character found, return '-'
    }

    public static void main(String[] args) {
        String input = "swiss";
        char result = firstNonRepeatingCharacter(input);

        if (result != '-') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No unique character found.");
        }
    }
}
