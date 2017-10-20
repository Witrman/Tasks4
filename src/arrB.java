import java.util.Scanner;

public class arrB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            if(ar[i]%2==0)
            {
                System.out.println(ar[i]);
            }
        }

    }
}
