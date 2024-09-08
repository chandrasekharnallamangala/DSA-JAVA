import java.util.Scanner;

public class SwapEvenOdd {
    static int swapbits(int n) {
        int odd = (n  & 0xaaaaaaaa) >>> 1;
        int even = (n & 0x55555555) << 1;

        return (odd | even);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(swapbits(n));
    }
}
