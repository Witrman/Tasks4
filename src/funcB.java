import java.util.Scanner;

public class funcB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double b = sc.nextDouble();
        int a = sc.nextInt();
        System.out.println(pow(b,a));
    }

    private static double pow(double a, int b)
    {
        return  Math.pow(a,b);

    }
}
