
/**
 * Question: Write a Java program to merge two arrays into a single array.
 * 
 * Example:
 * Input: arr = {10, 20, 30, 40, 50}, brr = {60, 70, 80, 90, 100}
 * Output: [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
 */

import java.util.Arrays;

public class program_5_merge {
    public static void main(String[] args) {
              int arr[] = {10,20,30,40,50};
              int brr [] = {60,70,80,90,100};

              int merge [] = new int[arr.length+brr.length];

              int cnt =0;

              for (int i = 0; i < arr.length; i++) {
                merge[cnt++] =arr[i];
              }
              for (int i = 0; i < brr.length; i++) {
                merge[cnt++] =brr[i];
              }
              

              System.out.println(Arrays.toString(merge));
              // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
    }
}
