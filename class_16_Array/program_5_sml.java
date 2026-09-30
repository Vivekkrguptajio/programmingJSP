
/**
 * Question: Write a Java program to find the smallest (minimum) element in an array.
 * 
 * Example:
 * Input: arr = {1, 2, 3, 4, 5, 5, 6}
 * Output: 1
 */

import java.util.Arrays;

public class program_5_sml {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,5,6};
        int  min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min =arr[i];
            }
        }System.out.println(min);

        System.out.println(Arrays.stream(arr).min().getAsInt());
    }
}
