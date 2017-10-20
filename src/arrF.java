import java.util.Scanner;

public class arrF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();

        }
        for (int i = 1; i < n - 1; i++) {
            if (ar[i - 1] < ar[i] && ar[i] > ar[i + 1]) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}
