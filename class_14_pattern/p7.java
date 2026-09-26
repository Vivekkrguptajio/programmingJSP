//       * 
//     * * * 
//   * * * * * 
// * * * * * * * 
//   * * * * * 
//     * * * 
//       * 

public class p7 {
    public static void main(String[] args) {
        int n = 7;
        int uh = n/2+1; //3
        int dh = n-(n/2)-1; //4

        for (int i = 1; i <=uh; i++) {
            for (int j = 1; j <= uh - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= dh; i++) { 
            for (int j = 1; j <= i ; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*(dh-i)+1; j++) {
                System.out.print("* ");
            }
             
            System.out.println();
        }
    }
}
