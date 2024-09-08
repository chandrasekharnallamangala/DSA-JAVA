import java.util.Scanner;

public class BinaryToDecimal {
    static int binaryToDecimal(String bin) {
        int decimal = 0;
        int powerOfTwo = 1;
        for (int i = bin.length() - 1; i >= 0; i--) {
            if (bin.charAt(i) == '1') {
                decimal += powerOfTwo;
            }
            powerOfTwo *= 2;
        }
        return decimal;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String bin = sc.next();
        System.out.println(binaryToDecimal(bin));
    }
}
