/**
 * Question: Write a Java program to find the Greatest Common Divisor (GCD) of two numbers.
 * 
 * Example:
 * Input: a = 8, b = 12
 * Output: 4
 */
public class gcd {
    public static void main(String[] args) {
        
        int a =8;
        int b =12;

        System.out.println(gcd(a,b));
    }

    static int gcd(int a ,int b){
        int val =1;
        for (int i = 1; i <= b; i++) {
            if(a%i==0 && b%i==0){
                val =i;
            }
        }
        return val;
    }
}
