/*
 * Question: Write a program to find the Nth prime number.
 * 
 * Example:
 * Input: n = 4
 * Output: 7
 * (Explanation: The prime numbers are 2, 3, 5, 7... so the 4th prime number is 7)
 */
public class nth_prime_num {
    public static void main(String[] args) {
        int n =4;
        int count =0;
        int value =0;

        int i =0;
        while (count!=n) {
            if(isPrime(i)){
                value =i;
                count++;
            }
            i++;
        }
        System.out.println(value);
    }

    static boolean isPrime(int num){
        if(num<=1) return false;
        for (int i = 2; i <= num/2; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
