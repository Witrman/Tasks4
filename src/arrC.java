import java.util.Scanner;

public class arrC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] ar = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            if(ar[i] > 0)
            {
sum++;
            }
        }
        System.out.println(sum);

    }
}
