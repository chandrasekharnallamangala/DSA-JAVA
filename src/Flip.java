import java.util.Scanner;

public class Flip {
    static int toggle(int n,int bit) {
        int mask = 1 << bit;
        int res =  n ^ mask  ;
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int position = sc.nextInt();
        System.out.print(toggle(n,position));
    }
}
