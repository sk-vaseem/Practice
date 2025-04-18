import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {

    // Function to check if a string is a palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Backtracking function to find all palindrome partitions
    public static void findPartitions(String s, int start, List<String> current, List<List<String>> result) {
        if (start == s.length()) {
            // Add the current partition to the result if we've reached the end
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            // Check if the substring is a palindrome
            if (isPalindrome(s, start, i)) {
                // Add the palindrome substring to the current list
                current.add(s.substring(start, i + 1));

                // Recur for the remaining substring
                findPartitions(s, i + 1, current, result);

                // Remove the last added substring (backtrack)
                current.remove(current.size() - 1);
            }
        }
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();
        findPartitions(s, 0, new ArrayList<>(), result);
        return result;
    }

    public static void main(String[] args) {
        String s = "aab";

        List<List<String>> partitions = partition(s);
        System.out.println("Palindrome Partitions:");
        for (List<String> partition : partitions) {
            System.out.println(partition);
        }
    }
}
