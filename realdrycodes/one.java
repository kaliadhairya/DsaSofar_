public class one {
    public static void main(String[] args) {
        int[] primes = findPrimes(8000); 
        printPrimes(primes, 1000);
    }

    public static int[] findPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        int[] primes = new int[n + 1];
        int count = 0;

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes[count++] = i;

                if (count == 1000) {
                    break;
                }

                for (int j = i * 2; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        return primes;
    }

    public static void printPrimes(int[] primes, int count) {
        System.out.println("First 1000 prime numbers:");
        for (int i = 0; i < count; i++) {
            System.out.print(primes[i] + " ");
        }
    }
}
