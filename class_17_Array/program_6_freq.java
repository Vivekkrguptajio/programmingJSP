/**
 * Question: Write a Java program to count and print the frequency of each element in an array.
 * 
 * Example:
 * Input: arr = {1, 2, 3, 1, 4, 5, 1, 2, 6, 4, 5, 1, 2}
 * Output:
 * 0 : 0
 * 1 : 4
 * 2 : 3
 * 3 : 1
 * 4 : 2
 * 5 : 2
 * 6 : 1
 */

public class program_6_freq {
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
            System.out.println(i+" : "+freq[i]);
        }
    }
}
