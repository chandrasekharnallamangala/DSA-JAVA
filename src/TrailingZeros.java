import java.util.Scanner;

public class TrailingZeros {
    static int trailZeros(int n) {
        int mask = (n & (n-1));
        int rmsb = n ^ mask;
        int res  = (int)(Math.log10(rmsb) / Math.log10(2));
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(trailZeros(n));
    }
}
