
/**
 * Question: Write a Java program to find the largest (maximum) element in an array.
 * 
 * Example:
 * Input: arr = {1, 2, 3, 4, 5, 5, 6}
 * Output: 6
 */

import java.util.Arrays;

public class program_4_bigest_ele {
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,5,6};
        int  max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max =arr[i];
            }
        }System.out.println(max);

        System.out.println(Arrays.stream(arr).max().getAsInt());
    }
}
