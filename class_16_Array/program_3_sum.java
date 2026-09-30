
/**
 * Question: Write a Java program to calculate and print the sum of all odd elements in an array.
 * 
 * Example:
 * Input: arr = {1, 2, 3, 4, 5, 6}
 * Output: 9
 * Explanation: Odd elements are 1, 3, 5 -> Sum = 1 + 3 + 5 = 9
 */

import java.util.Arrays;

public class program_3_sum {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        int sum =0;
        // ? ways 1 to print
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==1){
                sum+=arr[i];
            }
        }System.out.println(sum);

        // ? ways 2 to print
        System.out.println(Arrays.stream(arr).filter(ele->ele%2==1).sum());
    }
}
