// * 
// * * 
// * * * 
// * * * * 
// * * * 
// * * 
// * 

public class p1 {
    public static void main(String[] args) {
        
        int n =7;
        int uf = n/2+1;
        int df = n/2;
        for (int i = 1; i <=uf; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = df; i >=1; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
