/*
 * Question: Write a Java program to find the sum of all prime numbers from 1 to N.
 * 
 * Example:
 * Input : n = 100
 * Output: 1060
 */
public class sum_of_prime {
    public static void main(String[] args) {
        int n =100;

        int sum =0;
        for (int i = 1; i <=n; i++) {
            if(isPrime(i)){
                sum=sum+i;
            }
        }System.out.println(sum);
    }
    static boolean isPrime(int num){

        if(num<=1) return false;
        for (int i = 2; i < num/2; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
