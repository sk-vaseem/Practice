public class SumOfPrimes {

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Function to calculate the sum of prime numbers in an array
    public static int sumOfPrimes(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (isPrime(num)) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 10, 13, 17, 21, 29};
        int primeSum = sumOfPrimes(numbers);
        System.out.println("Sum of prime numbers: " + primeSum);
    }
}
