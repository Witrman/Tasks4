import java.util.Scanner;

public class arrK {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] ar = new int[n];
            int sum = 1;
            for (int i = 0; i <n ; i++) {
                ar[i] = sc.nextInt();
            }

            for (int i = 1; i <ar.length; i++) {
                if (ar[i]!=ar[i-1]){sum++;}
            }
            System.out.println(sum);
        }
    }

