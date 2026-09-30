
/**
 * Question: Write a Java program to print all even elements from an array 
 *           using multiple techniques:
 *           1. Standard for loop
 *           2. For-each loop
 *           3. Java 8 Streams (filter & forEach)
 * 
 * Example:
 * Input: arr = {10, 20, 30, 40, 50, 60}
 * Output:
 * 10 20 30 40 50 60 
 * 10 20 30 40 50 60 
 * 10 20 30 40 50 60 
 */

import java.util.Arrays;

public class program_2_Even_ele {
    public static void main(String[] args) {
          int [] arr ={10,20,30,40,50,60};

          for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0) System.out.print(arr[i]+" ");
          }System.out.println();

          for(int ele : arr){
            if(ele%2==0) System.out.print(ele+" ");
          }System.out.println();

          Arrays.stream(arr).filter(ele -> ele%2==0).forEach(ele->System.out.print(ele+" "));
    }
}
