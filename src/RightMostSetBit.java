import java.util.Scanner;

public class RightMostSetBit {
    static int rmSetBit(int n) {
        int mask = n & (n-1);
        int xor  = n ^ mask;
        int res  = (int)(Math.log10(xor) / Math.log10(2)) + 1;
        return res;
    }
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(rmSetBit(n));
    }
}
