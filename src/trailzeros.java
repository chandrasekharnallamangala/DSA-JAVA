import java.util.Scanner;

public class trailzeros {
    static int trailzero(int n) {
        int res = 0;
        int powerof5 = 5;
        while(n >= powerof5){
            res = res + (n/powerof5);
            powerof5 *= 5;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(trailzero(n));
    }
}
