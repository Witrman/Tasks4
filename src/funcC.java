import java.util.Scanner;

public class funcC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int a = sc.nextInt();
        boolean bb;
        boolean aa;
        aa = a == 1;
        bb = b == 1;
        if(xor(bb,aa)) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }

    private static boolean xor(boolean a, boolean b)
    {
        return  a^b ;

    }
}
