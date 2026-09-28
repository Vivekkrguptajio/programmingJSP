// * * * * 
// * * * 
// * * 
// * 
// * * 
// * * * 
// * * * * 

public class p2 {
    public static void main(String[] args) {
        int n =7;
        int uh = n/2+1;

        for (int i = uh; i >=2 ; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= uh ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
