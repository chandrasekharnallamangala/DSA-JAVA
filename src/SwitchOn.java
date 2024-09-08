import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchOn {
    static int switchOn(int a,int i) {
        int mask = 1 << i;
        int on = a | mask;
        return on;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int i = sc.nextInt();
        int res = switchOn(a,i);
        System.out.println(res);
    }
}
