import java.util.Scanner;

public class arrD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int sum = 0;
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();

        }
        for (int i = 1; i <n ; i++) {
         if(ar[i-1] < ar[i])
         {
             sum++;
         }
        }
        System.out.println(sum);

    }
}
