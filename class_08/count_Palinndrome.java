/*
 * Question: Write a Java program to print all Palindrome numbers in the range from 1 to N.
 * 
 * A Palindrome number is a number that remains the same when its digits are reversed.
 * 
 * Examples:
 * - 121 -> Reverse is 121 (Palindrome)
 * - 1331 -> Reverse is 1331 (Palindrome)
 * - For N = 500: Prints all palindrome numbers up to 500.
 */
public class count_Palinndrome {
    public static void main(String[] args) {

        int n = 500;
        for (int i = 1; i <= n; i++) {
            if (isPallinDrome(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPallinDrome(int num) {
        return num == reverse(num);
    }

    static int reverse(int num) {
        int revnum = 0;
        while (num != 0) {
            int rem = num % 10;
            revnum = revnum * 10 + rem;
            num = num / 10;
        }
        return revnum;
    }
}
