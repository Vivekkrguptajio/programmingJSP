
/**
 * Question: Write a Java program to find the missing element in an array 
 *           containing numbers from 0 to n.
 * 
 * Example:
 * Input: arr = {4, 1, 0, 2}
 * Output: Missing Element :3
 * Explanation: Range of numbers is 0 to 4 (n = arr.length = 4).
 *              Expected sum = 4 * (4 + 1) / 2 = 10.
 *              Actual sum = 4 + 1 + 0 + 2 = 7.
 *              Missing element = 10 - 7 = 3.
 */

public  class program_2_missing_ele{
    public static void main(String[] args) {

        int arr [] = {4,1,0,2};
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println("Missing Element :"+((arr.length*(arr.length+1)/2)-sum));
    }
}