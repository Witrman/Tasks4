import java.util.Scanner;

public class funcA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int s = min(a,b,c,d);
        System.out.println(s);
    }

    private static int min(int a, int b, int c, int d)
    {
        return Math.min(a,Math.min(b,Math.min(c,d)));
    }
}
