/*
 * Question: Write a Java program to check whether a given number is an Automorphic number.
 * 
 * An Automorphic number is a number whose square ends in the same digits as the number itself.
 * 
 * Examples:
 * - 5 -> 5^2 = 25 (Ends with 5, Automorphic)
 * - 6 -> 6^2 = 36 (Ends with 6, Automorphic)
 * - 25 -> 25^2 = 625 (Ends with 25, Automorphic)
 * - 76 -> 76^2 = 5776 (Ends with 76, Automorphic)
 */
public class autoMophic {
    public static void main(String[] args) {
        int n = 7;

        if (isAuomorphic(n)) {
            System.out.println("AutoMophic");
        } else {
            System.out.println("Not AutoMophic");
        }
    }

    static boolean isAuomorphic(int num) {

        int sq = num * num;

        while (num != 0) {
            int rem = sq % 10;
            int nDigit = num % 10;

            if (rem != nDigit) {
                return false;
            }

            sq = sq / 10;
            num = num / 10;
        }
        return true;

    }
}
