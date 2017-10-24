import java.util.Scanner;

public class funcE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if(pr(x))
        {
            System.out.println("composite");
        }
        else
        {
            System.out.println("prime");
        }
    }

    private static boolean pr(int x)
    {
        boolean d = false;
        for (int i = 2; i < x-1 ; i++) {
            d= x%i==0;
            break;
        }
        return d;
    }

}
