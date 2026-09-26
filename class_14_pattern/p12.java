// a b c d e f g 
//   A B C D E 
//     a b c 
//       A 
//     a b c 
//   A B C D E 
// a b c d e f g 

public class p12 {
     public static void main(String[] args) {
        int n = 7;
        int uh = n/2+1; //3
        int dh = n-(n/2); //4

         for (int i = 1; i <= dh; i++) { 
            for (int j = 2; j <= i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*(dh-i)+1; j++) {
                if(i%2==1) System.out.print((char)(96+j)+" ");
                else System.out.print((char)(64+j)+" ");
            }
             
            System.out.println();
        }

        for (int i = 2; i <=uh; i++) {
            for (int j = 1; j <= uh - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if(i%2==0) System.out.print((char)(96+j)+" ");
                else System.out.print((char)(64+j)+" ");
            }
            System.out.println();
        }
    }
}
