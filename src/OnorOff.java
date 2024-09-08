import java.sql.SQLOutput;
import java.util.Scanner;

class onorOff {
    static String OnOrOff(int n,int i){
        int mask = 1 << i;
        return  (n & mask) == 0 ? "OFF" : "ON";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(OnOrOff(n,i));
    }
}
