//         a 
//       A B C 
//     a b c d e 
//   A B C D E F G 
// a b c d e f g h i  

public class p3 {
    public static void main(String[] args) {
        
        int n =5;

        for (int i = 1; i <= n; i++) {
            
            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if(i%2==0) System.out.print((char)(64+j)+" ");
                else System.out.print((char)(96+j)+" ");
            }
            System.out.println();
        }
    }
}
