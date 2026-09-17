// Q. WAP to print all even numbers from 1 to N (exclusive).
//    Example: N = 101 → Output: 2 4 6 8 ... 100

package class_03;
public class print_even_num {
    public static void main(String[] args) {
        
        int n = 101;
        for (int i = 2; i < n; i+=2) {
            System.out.print(i+" ");
        }
    }
}
