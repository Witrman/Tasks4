import java.util.Scanner;

public class arrJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int buf = 0;
        for (int i = 0; i <n ; i++) {
            ar[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
           if(ar[i]> buf){buf=ar[i];}
        }
        System.out.println(buf);
    }
}
