import java.util.Scanner;

public class ReverseBits {
    static int reverseBits(int n) {
        int r=31,l=0;
        int rev = 0;
        while(l < r) {
            if((n & (1<<r)) != 0 ) {
                rev = (rev | (1 << l));
            }

            if((n & (1<<l)) !=0){
                rev = (rev | (1 << r));
            }
            l++;
            r--;
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(reverseBits(n));
    }
}
