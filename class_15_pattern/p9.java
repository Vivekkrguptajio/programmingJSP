// 1 2 3 4 5 6 7 8 9 
//   a b c d e f g 
//     1 2 3 4 5 
//       a b c 
//         1 
//       a b c 
//     1 2 3 4 5 
//   a b c d e f g 
// 1 2 3 4 5 6 7 8 9 

public class p9 {
    public static void main(String[] args) {
        int n = 9;
        int uh = n/2+1;
        int dh = n/2;

        
        for(int i = 1 ;i<= uh ;i++){
            for (int j = 2; j <=i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*(uh-i)+1; j++) {
                if(i%2==1){
                    System.out.print(j+" ");
                }else System.out.print((char)(96+j)+" ");
            }
            System.out.println();
        }

        for(int i = 2 ;i<= dh+1 ;i++){
            for (int j = 0; j <=dh-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=2*i-1; j++) {
                if(i%2==1){
                    System.out.print(j+" ");
                }else System.out.print((char)(96+j)+" ");
            }
            System.out.println();
        }
    }
}
