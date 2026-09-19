/*
 * Question: Write a Java program to find the Greatest Common Divisor (GCD / HCF) of two numbers.
 * 
 * Example:
 * Input : a = 8, b = 12
 * Output: 4
 */
public class GCD {
    public static void main(String[] args) {
        int a = 8;
        int b =12;
        System.out.println(gcd(a,b));
    }
    static int gcd(int a,int b){

        int d =0;
        for (int i = 1; i <= a; i++) {
            if(a%i==0 && b%i==0){
                d=i;
            }
        }
        return d;
    }
}
