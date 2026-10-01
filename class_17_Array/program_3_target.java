
/**
 * Question: Write a Java program to search for a target element in an array (Linear Search) 
 *           and print its index if found, otherwise print "Not Found".
 * 
 * Example:
 * Input: arr = {10, 20, 30, 40, 50, 60}, target = 90
 * Output: Not Found
 * 
 * If target = 30:
 * Output: Found At IDX: 2
 */

public class program_3_target {
    public static void main(String[] args) {
        
        int arr [] = {10,20,30,40,50,60};
        int target =90;

        int idx =foundIdx(arr, target);
        
        if(idx!=-1){
            System.out.println("Found At IDX: "+foundIdx(arr,target));
        }else {
            System.out.println("Not Found");
        }
    }
    static int foundIdx(int [] arr,int target){

        for (int i = 0; i < arr.length; i++) {
            if(target==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
