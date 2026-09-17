package class_03;
public class divisor_of_num {
    public static void main(String[] args) {
        
        int n =108;

        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
