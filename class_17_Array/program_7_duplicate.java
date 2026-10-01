
/**
 * Question: Write a Java program to find and print duplicate elements in an array along with their frequency.
 * 
 * Example:
 * Input: arr = {1, 2, 3, 1, 4, 5, 1, 2, 6, 4, 5, 1, 2}
 * Output:
 * 1 : 4
 * 2 : 3
 * 4 : 2
 * 5 : 2
 * Explanation: Elements having frequency greater than 1 are duplicates.
 */

public class program_7_duplicate {
     public static void main(String[] args) {
        
        int arr [] = {1,2,3,1,4,5,1,2,6,4,5,1,2};

        int max =Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max =arr[i];
            }
        }
        
        int freq [] = new int[max+1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>1)
            System.out.println(i+" : "+freq[i]);
        }
    }
}
