 import java.util.*;
 public class otp {
    static char[] OTP(int len){
        System.out.println("generating otp ");
        System.out.println("your otp is :");
        String number = "0123456789";
        Random random = new Random();
        char []oTp = new char[len];
        for(int i=0;i<len;i++){
            oTp[i]=number.charAt(random.nextInt(number.length()));
        }
        return oTp;
    }
    public static void main(String[]args){
        int len = 4;
        System.out.println(OTP(len));
    }
}
