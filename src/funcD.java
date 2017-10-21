import java.util.Scanner;

public class funcD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        int a = sc.nextInt();
        int c = sc.nextInt();
        boolean bb;
        boolean aa;
        boolean cc;
        aa = a == 1;
        bb = b == 1;
        cc = c ==1;

        if(Electic(bb,aa,cc)) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }
    }

    private  static boolean Electic(boolean b,boolean a , boolean c)
    {
        int s =  0;
        if (a) {s++;}
        if (b) {s++;}
        if (c) {s++;}

        return (s>=2);
    }
}
