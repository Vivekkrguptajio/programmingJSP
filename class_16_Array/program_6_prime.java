/**
 * Question: Write a Java program to find and print all prime numbers present in an array.
 * 
 * Example:
 * Input: arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}
 * Output: 2 3 5 7 11 13 
 */
public class program_6_prime {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};

        for (int i = 0; i < arr.length; i++) {
            if(isPrime(arr[i])){
                System.out.print(arr[i]+" ");
            }
        }
    }
    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i =2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}
