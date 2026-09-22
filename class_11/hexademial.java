
public class hexademial {
    public static void main(String[] args) {
        int n = 895;
        System.out.println(binary(n));

    }
    static String binary(int num){

        String str ="";
        while (num!=0) {
            if(num%16==10) str = 'A'+str;
            else if(num%16==11) str = 'B'+str;
            else if(num%16==12) str = 'C'+str;
            else if(num%16==13) str = 'D'+str;
            else if(num%16==14) str = 'E'+str;
            else if(num%16==15) str = 'F'+str;
            else str = num%16+str;
            num/=16; 
             
        }
        return str;
    }
}

