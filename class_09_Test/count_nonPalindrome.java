/*
 * Question: Write a Java program to count the total number of non-palindrome numbers from 1 to N.
 * 
 * Example:
 * Input : n = 1000
 * Output: Total Not Palindrome : 892
 */
public class count_nonPalindrome {
    public static void main(String[] args) {
        int n = 1000, count = 0;

        for (int i = 1; i <= n; i++) {
            if (!isPalindrome(i)) {
                count++;
            }
        }System.out.println("Total Not Palindrome :"+count);
    }

    static boolean isPalindrome(int num) {
        return num == reverse(num);
    }

    static int reverse(int num) {
        int rev  =0;
        while (num!=0) {
            int r =num%10;
            rev=rev*10+r;
            num=num/10;
        }
        return rev;
    }

}
