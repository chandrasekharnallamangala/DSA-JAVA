import java.util.Scanner;

public class SwitchOff {
    static int switchOff(int n, int i) {
        int mask = ~(1 << i);
        int off = n & mask;
        return off;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(switchOff(a,i));
    }
}
