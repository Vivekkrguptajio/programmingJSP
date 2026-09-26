//         1 
//       1 2 1 
//     1 2 3 2 1 
//   1 2 3 4 3 2 1 
// 1 2 3 4 5 4 3 2 1 

public class p6 {
    public static void main(String[] args) {
        int n =5;
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i; j++) {
                System.out.print(j+" ");
            }
            for (int j = i-1; j >=1; j--) {  // 2 Se chalna start kiya i =2 se i =1 ke liye nhi chala ye for loop
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
