
/**
 * Question: Write a Java program to calculate and print the sum of all palindrome numbers in an array.
 * 
 * Example:
 * Input: arr = {11, 22, 12, 99, 54, 66, 7, 88, 44, 23}
 * Output: 337
 * Explanation: Palindrome numbers are 11, 22, 99, 66, 7, 88, 44
 *              Sum = 11 + 22 + 99 + 66 + 7 + 88 + 44 = 337
 */

public class p7_sumofPallindrome {
    public static void main(String[] args) {
        int arr [] = {11,22,12,99,54,66,7,88,44,23};
        int sum =0;

        for (int i = 0; i < arr.length; i++) {
            if(isPalindrime(arr[i])){
                sum+=arr[i];
            }
        }System.out.println(sum);
    }

    static boolean isPalindrime(int num){
        int temp =num;
        int sum=0;
        while (temp!=0) {
            sum=sum*10+(temp%10);
            temp/=10;
        }
        return sum==num;
    }
}
