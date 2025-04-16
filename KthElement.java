public class KthElement {
    public static int findKthElement(int[] arr1, int[] arr2, int k) {
        int len1 = arr1.length, len2 = arr2.length;
        int index1 = 0, index2 = 0;

        while (true) {
            if (index1 == len1) return arr2[index2 + k - 1];
            if (index2 == len2) return arr1[index1 + k - 1];
            if (k == 1) return Math.min(arr1[index1], arr2[index2]);

            int mid = k / 2;
            int newIndex1 = Math.min(index1 + mid, len1) - 1;
            int newIndex2 = Math.min(index2 + mid, len2) - 1;

            if (arr1[newIndex1] <= arr2[newIndex2]) {
                k -= (newIndex1 - index1 + 1);
                index1 = newIndex1 + 1;
            } else {
                k -= (newIndex2 - index2 + 1);
                index2 = newIndex2 + 1;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 6, 7};
        int[] arr2 = {1, 4, 8, 10};
        int k = 5;
        System.out.println("The " + k + "-th element is: " + findKthElement(arr1, arr2, k));
    }
}
