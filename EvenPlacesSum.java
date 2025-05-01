public class EvenPlacesSum {
    public static void main(String[] args) {
        int number = 123456; // Example number
        System.out.println("Sum of even place digits: " + sumEvenPlaces(number));
    }

    public static int sumEvenPlaces(int num) {
        String numStr = String.valueOf(num);
        int sum = 0;

        for (int i = 0; i < numStr.length(); i++) {
            if (i % 2 == 0) { // Even index (0-based)
                sum += Character.getNumericValue(numStr.charAt(i));
            }
        }
        return sum;
    }
}
