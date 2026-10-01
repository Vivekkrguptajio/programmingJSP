
/**
 * Question: Write a Java program to find and print unique elements in an array (elements occurring only once).
 * 
 * Example:
 * Input: arr = {1, 2, 3, 1, 4, 5, 1, 2, 6, 4, 5, 1, 2}
 * Output:
 * 3 : 1
 * 6 : 1
 * Explanation: Elements having frequency equal to 1 are unique.
 */

public class program_8_unique {
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
            if(freq[i]==1)
            System.out.println(i+" : "+freq[i]);
        }
    }
}
