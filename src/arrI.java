import java.util.Scanner;

public class arrI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int buf = 0;
        for (int i = 0; i <n ; i++) {
            ar[i] = sc.nextInt();
        }
        buf = ar[ar.length-1];
        for (int i = ar.length-1; i >0; i--) {
             ar[i]=ar[i-1];
        }
        ar[0] = buf;
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]+" ");
        }
    }
}
