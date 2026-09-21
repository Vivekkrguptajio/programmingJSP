/*
 * Question: Write a program to print the first N prime numbers.
 * 
 * Example:
 * Input: n = 10
 * Output: 2 3 5 7 11 13 17 19 23 29
 */
public class till_nth_printPrime {
    public static void main(String[] args) {
        
        int n =10;
        int count =0;

        int i =0;
        while (count!=n) {
            if(isPrime(i)){
                System.out.print(i+" ");
                count++;
            }
            i++;
        }

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
