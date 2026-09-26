package class_12_pattern;
// a b c d e 
// a b c d e 
// a b c d e 
// a b c d e 
// a b c d e 

public class p10 {
    public static void main(String[] args) {
        int n =5;
        int c =1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char)(96+j)+" ");
            }
            System.out.println();
        }
    }
}
