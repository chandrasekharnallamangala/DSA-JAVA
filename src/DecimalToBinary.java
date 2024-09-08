import java.util.Scanner;

public class DecimalToBinary {
    static String decimalToBinary(int decimal) {
        String binary = "";
        while (decimal >= 1) {
            int rem = decimal%2;
            binary = rem + binary;
            decimal /= 2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(decimalToBinary(n));
    }
}
