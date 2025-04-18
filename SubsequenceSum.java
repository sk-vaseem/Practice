public class SubsequenceSum {

    // Recursive function to check for a subsequence with sum K
    public static boolean isSubsequenceWithSumK(int[] array, int index, int currentSum, int target) {
        // Base case: If the current sum is equal to the target, return true
        if (currentSum == target) {
            return true;
        }

        // If the index goes out of bounds, return false
        if (index == array.length) {
            return false;
        }

        // Include the current element in the subsequence
        boolean include = isSubsequenceWithSumK(array, index + 1, currentSum + array[index], target);

        // Exclude the current element from the subsequence
        boolean exclude = isSubsequenceWithSumK(array, index + 1, currentSum, target);

        // Return true if either including or excluding leads to the target sum
        return include || exclude;
    }

    public static void main(String[] args) {
        int[] array = {3, 1, 4, 2};
        int target = 6;

        if (isSubsequenceWithSumK(array, 0, 0, target)) {
            System.out.println("Yes, there exists a subsequence with sum " + target);
        } else {
            System.out.println("No, there doesn't exist a subsequence with sum " + target);
        }
    }
}
