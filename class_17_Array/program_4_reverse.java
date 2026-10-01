
/**
 * Question: Write a Java program to reverse an array in-place using two-pointer swap logic.
 * 
 * Example:
 * Input: arr = {10, 20, 30, 40, 50}
 * Output: 50 40 30 20 10 
 */

public class program_4_reverse {
    public static void main(String[] args) {
        
        int arr[] = {10,20,30,40,50};

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] =temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
