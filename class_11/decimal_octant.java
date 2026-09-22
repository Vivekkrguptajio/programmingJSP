
public class decimal_octant {
    public static void main(String[] args) {
        int n = 9;
        System.out.println(binary(n));

    }
    static String binary(int num){

        String str ="";
        while (num!=0) {
            str = num%8+str;
            num/=8;  
        }
        return str;
    }
}

