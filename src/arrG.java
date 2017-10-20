import java.util.Scanner;

public class arrG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int buf = 0;
        for (int i = 0; i <n ; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < n/2; i++) {
            buf = ar[i];
            ar[i] = ar[n-i-1];
            ar[n-i-1] = buf;
        }
        for (int a:ar
             ) {
            System.out.print(a+" ");
        }
    }
}
