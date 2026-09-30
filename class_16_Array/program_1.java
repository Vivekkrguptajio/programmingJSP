
/**
 * Question: Write a Java program to traverse and print all elements of an array 
 *           using different approaches:
 *           1. Standard for loop
 *           2. Arrays.toString() method
 *           3. For-each loop (enhanced for loop)
 *           4. Java 8 Streams (forEach)
 * 
 * Example:
 * Input: arr = {10, 20, 30, 40, 50, 60}
 * Output:
 * 10 20 30 40 50 60 
 * [10, 20, 30, 40, 50, 60]
 * 10 20 30 40 50 60 
 * 10 20 30 40 50 60 
 */

import java.util.Arrays;

public class program_1 {
    public static void main(String[] args) {
        int [] arr ={10,20,30,40,50,60};

        // ? 1. By using For loop it print elements
        for (int i = 0; i<=arr.length-1; i++) {
            System.out.print(arr[i]+" ");
        }System.out.println();

        // ? 2. By using toString() it print the boxes 
        System.out.println(Arrays.toString(arr));
        
        // ? 3. By Using for each loop
        for(int ele: arr){
            System.out.print(ele+" ");
        }System.out.println();

        // ? 4. By using stream Java 8 Version
        Arrays.stream(arr).forEach(ele->System.out.print(ele+" "));

    }
}
