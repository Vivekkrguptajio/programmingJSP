/*
 * Question: Write a program to find the nearest prime number(s) to a given number 'n'.
 *           If the number is already a prime number, print it directly.
 *           If there are two nearest prime numbers at the same distance, print both.
 * 
 * Example 1:
 * Input: n = 9
 * Output: 
 * Lowest Prime Digit: 7
 * Highest Prime Digit: 11
 * 
 * Example 2:
 * Input: n = 8
 * Output:
 * Lowest Prime Digit: 7
 */
public class nearest_prime {
    public static void main(String[] args) {
        int n = 9;

        // It Protects us from infinite loop if some one put -ve number;
        if(n<=1){
            System.out.println("Nearest Prime : 2");
            return ;
        }

        if(isPrime(n)){
            System.out.println("Nearest Prime Number :"+n);
            return ;
        }

        int lp = leftFirstPrime(n);
        int rp = rightFirstPrime(n);

        if (n - lp > rp - n) {
            System.out.println("Nearest Prime Digit: "+rp);
        } 
        else if (n - lp < rp - n) {
            System.out.println("Nearest Prime Digit: "+lp);
        } 
        else if ((n - lp) == (rp - n)) {
            System.out.println("Lowest Nearest Prime Digit: "+lp);
            System.out.println("Highest Nearest Prime Digit: "+rp);
        }
    }

    static int leftFirstPrime(int num) {
        int count = 0;
        while (count != 1) {
            if (isPrime(num)) {
                count++;
                break;
            }
            num--;
        }
        return num;
    }

    static int rightFirstPrime(int num) {
        int count = 0;
        while (count != 1) {
            if (isPrime(num)) {
                count++;
                break;
            }
            num++;
        }
        return num;
    }

    static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
