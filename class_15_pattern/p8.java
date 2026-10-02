// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// 1 2 3 
// 1 2 
// 1 

public class p8 {
    public static void main(String[] args) {
        
        int n =7;
        int uh =  n/2 +1;
        int dh = n/2;

        for (int i = 1; i <= uh; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

        for (int i = 1; i <= dh ; i++) {
            for (int j = 1; j <= dh-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
