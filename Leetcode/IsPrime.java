public class IsPrime {
    public static boolean isPrime(int num) {
        if (num < 2)
            return false; // 0 and 1 are not prime numbers

        for (int i = 2; i * i <= num; i++) { // Optimized loop till sqrt(num)
            if (num % i == 0) {
                return false; // If num is divisible by i, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(num + " is " + (isPrime(num) ? "a prime number" : "not a prime number"));
    }
}
