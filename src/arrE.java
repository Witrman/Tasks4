import java.util.Scanner;

public class arrE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();

        }
        for (int i = 1; i < n; i++) {
            if (ar[i - 1] > 0 && ar[i] > 0) {
                sum++;
            }
        }
        if (sum == 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
