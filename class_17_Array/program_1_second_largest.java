
/**
 * Question: Write a Java program to find the largest and second largest element in an array.
 * 
 * Example:
 * Input: arr = {10, 20, 30, 25}
 * Output:
 * 30
 * 25
 * Explanation: The maximum element is 30, and the second largest element is 25.
 */

public class program_1_second_largest {
    public static void main(String[] args) {
        
        int arr [] = {10, 20, 30, 25};

        int max =Integer.MIN_VALUE;
        int secmax = max;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                secmax =max;
                max=arr[i];
            }
            if(secmax<max && arr[i]!=max){
                secmax =arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secmax);
    }
}
