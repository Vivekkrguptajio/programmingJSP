public class decimal_binary {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(binary(n));

    }
    static String binary(int num){

        String str ="";
        while (num!=0) {
            str = num%2+str;
            num/=2;  
        }
        return str;
    }
}
